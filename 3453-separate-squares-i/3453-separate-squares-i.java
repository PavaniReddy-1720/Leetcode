class Solution {
    public double separateSquares(int[][] squares) {
        double low = Double.MAX_VALUE, high = Double.MIN_VALUE;

        for (int[] s : squares) {
            low = Math.min(low, s[1]);
            high = Math.max(high, s[1] + s[2]);
        }

        for (int i = 0; i < 100; i++) { // enough for 1e-6 precision
            double mid = (low + high) / 2;
            double[] areas = computeAreas(squares, mid);

            double below = areas[0];
            double above = areas[1];

            if (above > below) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return low;
    }

    private double[] computeAreas(int[][] squares, double y) {
        double below = 0, above = 0;

        for (int[] s : squares) {
            double yi = s[1];
            double li = s[2];
            double top = yi + li;
            double area = li * li;

            if (y <= yi) {
                above += area;
            } else if (y >= top) {
                below += area;
            } else {
                double hBelow = y - yi;
                double hAbove = top - y;
                below += hBelow * li;
                above += hAbove * li;
            }
        }
        return new double[]{below, above};
    }
}
