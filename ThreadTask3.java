import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTask3{
    public static void main(String[] args) {
        ExecutorService ex=Executors.newFixedThreadPool(5);
        Runnable a=new MessageProcesser(1);
        ex.execute(a);
        for(int i=2;i<=10;i++){
            ex.execute(new MessageProcesser(i));
        }
        ex.shutdown();
    }
}