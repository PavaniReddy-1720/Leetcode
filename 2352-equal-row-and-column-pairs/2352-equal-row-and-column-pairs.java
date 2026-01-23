class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> map = new HashMap<>();

        // Store all rows
        for (int i = 0; i < n; i++) {
            StringBuilder rowKey = new StringBuilder();
            for (int j = 0; j < n; j++) {
                rowKey.append(grid[i][j]).append(",");
            }
            map.put(rowKey.toString(), map.getOrDefault(rowKey.toString(), 0) + 1);
        }

        int count = 0;

        // Compare each column
        for (int j = 0; j < n; j++) {
            StringBuilder colKey = new StringBuilder();
            for (int i = 0; i < n; i++) {
                colKey.append(grid[i][j]).append(",");
            }
            count += map.getOrDefault(colKey.toString(), 0);
        }

        return count;
    }
}
