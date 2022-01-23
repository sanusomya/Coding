package Recursion;
import java.util.*;
public class delete_middle_element_of_stack {
    //middle element means size/2;
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(10);
        stack.add(2);
        stack.add(3);
        stack.add(9);
        stack.add(5);
        solve(stack,stack.size()/2);
        System.out.println(stack.peek());
    }
    static void solve(Stack<Integer> stack, int mid){
        if(mid == 0){
            stack.pop();
            return;
        }
        int x = stack.pop();
        solve(stack,mid-1);
        stack.add(x);
    }
}
