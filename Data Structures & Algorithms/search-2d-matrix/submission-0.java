class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length; int columns = matrix[0].length;
        int head = 0; int tail = (rows * columns) - 1;

        while(head <= tail){
            int middle = (head + tail)/2;
            int middleRow = middle/columns;
            int middleColumn = middle % columns;
            int middleElement = matrix[middleRow][middleColumn];

            if(target == middleElement){
                return true;
            } else if(target > middleElement){
                head = middle + 1;
            } else {
                tail = middle - 1;
            }
        }
        return false;
    }
}
