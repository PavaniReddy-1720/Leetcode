import java.util.*;

class Solution {
    static class Event {
        long y, x1, x2;
        int type;
        Event(long y, long x1, long x2, int type) {
            this.y = y; this.x1 = x1; this.x2 = x2; this.type = type;
        }
    }

    public double separateSquares(int[][] squares) {
        List<Event> events = new ArrayList<>();
        for (int[] s : squares) {
            long x = s[0], y = s[1], l = s[2];
            events.add(new Event(y, x, x + l, 1));
            events.add(new Event(y + l, x, x + l, -1));
        }

        events.sort(Comparator.comparingLong(e -> e.y));
        TreeMap<Long, Integer> map = new TreeMap<>();

        List<Long> ys = new ArrayList<>();
        List<Double> areaPrefix = new ArrayList<>();
        double total = 0;

        long prevY = events.get(0).y;
        int i = 0;

        while (i < events.size()) {
            long curY = events.get(i).y;
            long height = curY - prevY;
            if (height > 0) {
                double width = coveredX(map);
                double area = width * height;
                total += area;
                ys.add(prevY);
                areaPrefix.add(total);
            }

            while (i < events.size() && events.get(i).y == curY) {
                Event e = events.get(i++);
                int v = map.getOrDefault(e.x1, 0) + e.type;
                if (v == 0) map.remove(e.x1);
                else map.put(e.x1, v);

                int v2 = map.getOrDefault(e.x2, 0) - e.type;
                if (v2 == 0) map.remove(e.x2);
                else map.put(e.x2, v2);
            }
            prevY = curY;
        }

        double half = total / 2.0;

        // Binary search on prefix slabs
        int lo = 0, hi = areaPrefix.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (areaPrefix.get(mid) < half) lo = mid + 1;
            else hi = mid;
        }

        double before = lo == 0 ? 0 : areaPrefix.get(lo - 1);
        double need = half - before;
        double width = coveredXAtY(events, ys.get(lo));
        return ys.get(lo) + need / width;
    }

    private double coveredX(TreeMap<Long, Integer> map) {
        double res = 0;
        int cnt = 0;
        long prev = 0;
        for (var e : map.entrySet()) {
            long x = e.getKey();
            if (cnt > 0) res += x - prev;
            cnt += e.getValue();
            prev = x;
        }
        return res;
    }

    private double coveredXAtY(List<Event> events, long y) {
        TreeMap<Long, Integer> map = new TreeMap<>();
        for (Event e : events) {
            if (e.y > y) break;
            int v = map.getOrDefault(e.x1, 0) + e.type;
            if (v == 0) map.remove(e.x1);
            else map.put(e.x1, v);

            int v2 = map.getOrDefault(e.x2, 0) - e.type;
            if (v2 == 0) map.remove(e.x2);
            else map.put(e.x2, v2);
        }
        return coveredX(map);
    }
}
