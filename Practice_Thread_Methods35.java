class Method_thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Morning Developers");
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Method_thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome back to my Youtube channel");
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Practice_Thread_Methods35 {
    public static void main(String[] args) {
        Method_thread1 mt1 = new Method_thread1();
        Method_thread2 mt2 = new Method_thread2();

        // mt1.setPriority(4);
        // mt2.setPriority(3);
        System.out.println(mt1.getPriority());
        System.out.println(mt2.getPriority());
        // mt1.start();
        // mt2.start();
    }
}
