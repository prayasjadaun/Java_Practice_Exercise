
class ConstThread extends Thread {
    public ConstThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Constructor in Thread " + getName());
        }
    }
}

public class Constructed_Thread32 {
    public static void main(String[] args) {
        ConstThread ct1 = new ConstThread("Prayas");
        ct1.start();
    }
}
