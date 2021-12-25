package Heap;
import java.util.*;

public class K_closest_points_to_origin {
    public static void main(String[] args) {
        int[][] points = {
                {3,3},
                {5,-1},
                {-2,4}

        };
        int k = 2;
        Comparator<pair> comp = new Comparator<>(){
            @Override
            public int compare(pair o1, pair o2) {
                if(Double.compare(o1.value,o2.value) < 0) return 1;
                else if(Double.compare(o1.value,o2.value) > 0) return -1;
                else return 0;
            }
        };
        PriorityQueue<pair> q = new PriorityQueue<>(comp);
        for(int i = 0; i<points.length; i++){
            q.add(new pair(i,Math.sqrt(points[i][0]*points[i][0]+points[i][1]*points[i][1])));
            if(q.size() > k) q.poll();
        }
        int[][] ans = new int[k][2];
        int i = 0;
        while(q.size() > 0){
            pair p = q.poll();
            int index = p.key;
            ans[i][0] = points[index][0];
            ans[i][1] = points[index][1];
            i++;
        }
        for (int j = 0; j<ans.length; j++) {
            System.out.println(ans[j][0] + "," + ans[j][1]);
        }
    }
}
class pair{
    int key;
    double value;
    public pair(int key, double value) {
        this.key = key;
        this.value = value;
    }
}

