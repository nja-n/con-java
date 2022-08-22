public class MessageProcesser implements Runnable{

    private int msg;
    public MessageProcesser(int message){
        this.msg=message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"[Recieved]"+msg);
        responce();
        System.out.println(Thread.currentThread().getName()+"[Finished]"+msg);
    }

    private void responce(){
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Error on responce");
        }
    }
    
}
