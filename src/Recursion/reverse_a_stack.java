package Recursion;
import java.util.*;
public class reverse_a_stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(10);
        stack.add(2);
        stack.add(3);
        stack.add(9);
        stack.add(5);
        System.out.println(stack);
        solve(stack);
        System.out.println(stack);
    }
    static void solve(Stack<Integer> stack){
        if(stack.size() == 1){
            return;
        }
        int l = stack.pop();
        solve(stack);
        merge(stack,l);
    }
    static void merge(Stack<Integer> stack,int x){
        if(stack.size() == 0){
            stack.push(x);
            return;
        }
        int l = stack.pop();
        merge(stack,x);
        stack.push(l);
    }
}
