class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-1-j];
                arr[i][n-1-j] = temp;
            }
        }
        for(int i = 0;i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 0){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
}