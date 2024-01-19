
class Thread_method1 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("This is  method of thread");
        }
    }
}

class Thread_method2 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("This is  second method of thread");
        }
    }
}

public class Thread_Methods34 {
    public static void main(String[] args) {
        Thread_method1 t1 = new Thread_method1();
        Thread_method2 t2 = new Thread_method2();

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
    }
}
