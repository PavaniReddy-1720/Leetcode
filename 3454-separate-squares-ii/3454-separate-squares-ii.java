class Solution {

    static class Event {
        long x;
        double y1, y2;
        int type;
        Event(long x, double y1, double y2, int type) {
            this.x = x;
            this.y1 = y1;
            this.y2 = y2;
            this.type = type;
        }
    }

    int[][] squares;

    public double separateSquares(int[][] squares) {
        this.squares = squares;
        double total = unionArea(1e18);
        double target = total / 2.0;

        double low = 0, high = 1e9;
        for (int i = 0; i < 60; i++) {
            double mid = (low + high) / 2;
            if (unionArea(mid) < target) low = mid;
            else high = mid;
        }
        return low;
    }

    private double unionArea(double mid) {
        ArrayList<Event> events = new ArrayList<>();

        for (int[] s : squares) {
            long x = s[0], y = s[1], l = s[2];
            long top = y + l;
            if (mid <= y) continue;
            double y2 = Math.min(top, mid);
            events.add(new Event(x, y, y2, 1));
            events.add(new Event(x + l, y, y2, -1));
        }

        events.sort((a, b) -> Long.compare(a.x, b.x));
        TreeMap<Double, Integer> map = new TreeMap<>();

        long prevX = 0;
        boolean first = true;
        double area = 0;

        for (Event e : events) {
            long curX = e.x;
            if (!first) {
                double width = curX - prevX;
                double coverY = coveredLength(map);
                area += width * coverY;
            }
            first = false;

            int v1 = map.getOrDefault(e.y1, 0) + e.type;
            if (v1 == 0) map.remove(e.y1);
            else map.put(e.y1, v1);

            int v2 = map.getOrDefault(e.y2, 0) - e.type;
            if (v2 == 0) map.remove(e.y2);
            else map.put(e.y2, v2);

            prevX = curX;
        }
        return area;
    }

    private double coveredLength(TreeMap<Double, Integer> map) {
        double res = 0;
        int count = 0;
        double prev = 0;
        for (var e : map.entrySet()) {
            double y = e.getKey();
            if (count > 0) res += y - prev;
            count += e.getValue();
            prev = y;
        }
        return res;
    }
}
