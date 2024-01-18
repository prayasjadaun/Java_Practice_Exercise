
class ConstThread1 extends Thread {
    public ConstThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Priority Thread in java "+ getName());
        }
    }
}

public class PriorityThread33 {

    public static void main(String[] args) {
        ConstThread ct1 = new ConstThread("Prayas");
        ConstThread ct2 = new ConstThread("JADAUN");
        ConstThread ct3 = new ConstThread("Prayas");
        ConstThread ct4 = new ConstThread("Prayas");
        ConstThread ct5 = new ConstThread("Prayas");
        ct1.setPriority(Thread.MAX_PRIORITY);
        ct1.start();
        ct2.start();
        ct3.start();
        ct4.start();
        ct5.start();
    }

}