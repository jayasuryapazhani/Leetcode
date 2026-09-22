class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum =0;
        for(int row=0;row<n;row++){
            sum+=mat[row][row];
            sum+=mat[row][n-1-row];
        }
        if(n%2!=0){
            sum-=mat[n/2][n/2];
        }
        return sum;
        
    }
}