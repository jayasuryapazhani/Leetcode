class Solution {
    public int islandPerimeter(int[][] grid) {

        int perimeter =0;

        for(int row =0;row<grid.length;row++){
            for(int column =0;column<grid[row].length;column++){
                if(grid[row][column]==1){
                    if(row==0 || grid[row-1][column]==0){
                        perimeter++;
                    }
                    if(row==grid.length-1 || grid[row+1][column]==0){
                        perimeter++;
                    }
                    if(column ==0 || grid[row][column-1]==0){
                        perimeter++;
                    }
                    if(column==grid[row].length-1||grid[row][column+1]==0){
                        perimeter++;
                    }
                }
            }
        }
        return perimeter;

        
    }
}