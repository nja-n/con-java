
class NewThread extends Thread{
    NewThread(){
    super("");
    System.out.println(this);
    start();
    }
    public void run(){
        try {
            for(int i=0;i<5;i++){
                System.out.println(i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            //TODO: handle exception
            System.out.println(e.toString());
        }
    }
}
public class ThreadTask1 {
    public static void main(String[] args) {
        new NewThread();
    }
}
