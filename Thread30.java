
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<100){
            System.out.println("My Thread is running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("My Thread 2 is chatting with her");
            System.out.println("I am good");
            i++;
        }
    }
}




public class Thread30 {
    public static void main(String[]args){
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
