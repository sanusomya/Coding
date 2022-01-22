package Binary_Search;

import java.util.*;

// the concept here is we start from the right-hand top corner
//in this case we can only go down if target > current element
// and left if target < current element
// and return -1 if index is out of bound
// this means the element is not preset
public class Search_in_a_row_wise_column_wise_sorted_array {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int target = 16;
        int n = matrix.length, m = matrix[0].length;
        int i = 0, j = m-1;
        while((i >= 0 && i < n) && (j >= 0 && j < m)) {
            if (matrix[i][j] == target) {
                System.out.println(i + " " + j);
                return;
            } else if (matrix[i][j] < target) i++;
            else if (matrix[i][j] > target) j--;
        }
    }
}
