class Solution {

    int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int m = heights.length;
        int n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        // Pacific DFS
        for(int i = 0; i < m; i++) {
            dfs(heights, pacific, i, 0);
        }

        for(int j = 0; j < n; j++) {
            dfs(heights, pacific, 0, j);
        }

        // Atlantic DFS
        for(int i = 0; i < m; i++) {
            dfs(heights, atlantic, i, n - 1);
        }

        for(int j = 0; j < n; j++) {
            dfs(heights, atlantic, m - 1, j);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {

                if(pacific[i][j] && atlantic[i][j]) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }

        return ans;
    }

    private void dfs(int[][] heights, boolean[][] visited,
                     int r, int c) {

        int m = heights.length;
        int n = heights[0].length;

        visited[r][c] = true;

        for(int[] d : dir) {

            int nr = r + d[0];
            int nc = c + d[1];

            if(nr < 0 || nr >= m || nc < 0 || nc >= n)
                continue;

            if(visited[nr][nc])
                continue;

            // Reverse flow condition
            if(heights[nr][nc] < heights[r][c])
                continue;

            dfs(heights, visited, nr, nc);
        }
    }
}