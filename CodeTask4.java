import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class CodeTask4 {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>();
        q.add(1);
        q.add(3);
        q.add(6);
        q.add(8);
        q.add(14);
        q.add(12);

        Stack<Integer> s=new Stack<>();

        System.out.println("Now Queue is : "+q);
        System.out.println("Now Stack is : "+s);
        
        s.push(q.peek());
        q.remove();
        s.push(q.peek());
        q.remove();

        System.out.println("Now Queue is : "+q);
        System.out.println("Now Stack is : "+s);
    }
}
