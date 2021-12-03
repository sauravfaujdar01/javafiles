//program to demonstrate exception
class myThread extends Thread{
public void run(){
    for (int i = 0; i < 10; i++) {
        System.out.println(i);
        try{
            if(i==5){
                Thread.sleep(5000);
            }
        }catch (InterruptedException e){

        }
    }
}
}
public class ques1 {
    public static void main(String[] args) {
        myThread onj =new myThread();
        onj.start();
    }
}
