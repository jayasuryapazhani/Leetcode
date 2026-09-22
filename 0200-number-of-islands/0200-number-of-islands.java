class Solution {
    public int numIslands(char[][] grid) {

        int islands =0;
        for(int row=0;row<grid.length;row++){
            for(int column =0;column<grid[row].length;column++){
                if(grid[row][column]=='1'){
                    islands++;
                    bfs(grid,row,column);
                }
            }
        }
        return islands;

        
        
    }
    void bfs(char[][] grid, int row, int column){
        if(grid[row][column]=='0'){
            return;
        }
        Queue<int[]> queue = new ArrayDeque<>();

        queue.offer(new int[]{row,column});
        grid[row][column]='0';

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];

           if(r>0&& grid[r-1][c]=='1'){
            grid[r-1][c]='0';
            queue.offer(new int[]{r-1,c});
           }
           if(r<grid.length-1&& grid[r+1][c]=='1'){
            grid[r+1][c]='0';
            queue.offer(new int[]{r+1,c});
           }
           if(c>0 && grid[r][c-1]=='1'){
            grid[r][c-1]='0';
            queue.offer(new int[]{r,c-1});
           }
           if(c<grid[r].length-1&&grid[r][c+1]=='1'){
            grid[r][c+1]='0';
            queue.offer(new int[]{r,c+1});
           }
        }
    }
}