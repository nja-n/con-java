import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> h=new ArrayList<>();
        HashMap<Integer,Integer> r=new HashMap<>();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            h.add(s.nextInt());
            if(r.containsKey(h.get(i))){
                r.replace(h.get(i),r.get(h.get(i))+2);
            }else{
                r.put(h.get(i),1);
            }
        }
        s.close();
        r.put(1,2);
        System.out.println(r);
        Queue<Integer> q=new PriorityQueue();
        q.remove();
    }
}