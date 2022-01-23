package Recursion;
import java.util.*;
public class sort_a_stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(10);
        stack.add(2);
        stack.add(3);
        stack.add(9);
        stack.add(5);
        sort(stack);
        System.out.println(stack);
    }
    static void sort(Stack<Integer> stack){
        if(stack.size() == 1) return;
        int x = stack.pop();
        sort(stack);
        merge(stack,x);
    }

    static void merge(Stack<Integer> stack, int x) {
        if(stack.size() == 0 || stack.peek() <= x){
            stack.add(x);
            return;
        }
        int l = stack.pop();
        merge(stack,x);
        stack.add(l);
    }
}
