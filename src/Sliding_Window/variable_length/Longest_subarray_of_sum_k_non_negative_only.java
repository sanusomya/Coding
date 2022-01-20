package Sliding_Window.variable_length;

// this approach will not work if array contains negative numbers
//-5 8 -14 2 8 12
// 15 5
//3 9 -2 4 1 -7 2 6 -5 8 -3 -7 6 2 1
public class Longest_subarray_of_sum_k_non_negative_only {
    public static void main(String[] args) {
        int[] A = {1,1,2,1,0,2,3,5};
        int N = A.length;
        int K = 5;
        int max = 0, i = 0, j = 0, sum = 0;
        while(j<N){
            sum += A[j];
            if(sum == K)
                max = Math.max(max,j-i+1);
            else if(sum > K){
                while(sum > K){
                    sum -= A[i];
                    i++;
                }
                if(sum == K) max = Math.max(max,j-i+1);
            }
            j++;
        }
        System.out.println(max);
    }
}
