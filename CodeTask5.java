import java.util.PriorityQueue;
import java.util.Queue;

public class CodeTask5 {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>();
        q.add(1);
        q.add(3);
        q.add(6);
        q.add(8);
        q.add(14);
        q.add(12);

        System.out.println("Now Queue is : "+q);
        
        System.out.println("Deleted"+q.peek());
        q.remove();
        System.out.println("Deleted"+q.peek());
        q.remove();

        System.out.println("Now Queue is : "+q);
    }
}
