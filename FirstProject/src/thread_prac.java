class hi extends Thread implements Runnable{
    public void run(){
        for(int i=0;i<=13;i++){
            System.out.println("hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class hello extends Thread implements Runnable{
    public void run(){
        for(int i=0;i<=13;i++){
            System.out.println("hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
public class thread_prac {
    public static void main(String[] args) {
        hi o1=new hi();
        hello o2=new hello();
        o1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        o2.start();
   }
}
