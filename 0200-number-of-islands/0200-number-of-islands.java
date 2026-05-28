class Solution {

    public void dfs(char[][] grid, int r, int c){

        int m = grid.length;
        int n = grid[0].length;

        // boundary check
        if(r < 0 || c < 0 || r >= m || c >= n)
            return;

        // water or already visited
        if(grid[r][c] == '0')
            return;

        // mark visited
        grid[r][c] = '0';

        // 4 directions
        dfs(grid, r+1, c);
        dfs(grid, r-1, c);
        dfs(grid, r, c+1);
        dfs(grid, r, c-1);
    }

    public int numIslands(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int count = 0;

        for(int i = 0; i < m; i++){

            for(int j = 0; j < n; j++){

                if(grid[i][j] == '1'){

                    count++;

                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }
}