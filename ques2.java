class myThread1 implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            if (i%2==1){
                System.out.println(i);
            }
        }
    }
}
class myThread2 implements Runnable{
    public void run(){
        for (int i = 0; i < 20; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
public class ques2 {
    public static void main(String[] args) {
        Runnable r = new myThread1();
        Thread t = new Thread(r);
        t.start();
        Runnable r2 = new myThread2();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
