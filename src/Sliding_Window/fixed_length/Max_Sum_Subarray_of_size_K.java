package Sliding_Window.fixed_length;

public class Max_Sum_Subarray_of_size_K {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int n = 4, K = 3;
        int max = 0;
        for(int i = 0; i<K; i++) max += arr[i];
        int i = 0, j = K;
        int sum = max;
        while(j < arr.length){
            sum = sum-arr[i]+arr[j];
            max = Math.max(max,sum);
            j++;
            i++;
        }
        System.out.println(max);
    }
}
