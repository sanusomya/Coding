package Recursion;
import java.util.*;
public class sort_an_array {

    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(3);
        li.add(5);
        li.add(7);
        li.add(1);
        li.add(0);
        li.add(10);
        li.add(3);
        li.add(2);
        solve(li);
        System.out.println(li);
    }
    static void solve(ArrayList<Integer> li){
        if(li.size() == 1) return;
        int x = li.remove(li.size()-1);
        solve(li);
        merge(li,x);
    }
    static void merge(ArrayList<Integer> li, int x){
        if(li.size() == 0 || li.get(li.size()-1) <= x){
            li.add(x);
            return;
        }
        int l = li.remove(li.size()-1);
        merge(li,x);
        li.add(l);

    }
}
