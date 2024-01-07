
interface Mycamera {
    void takesnap();

    void recordvideo();
}

interface Mywifi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class MyCellPhone {
    void callnumber(int phoneNumber) {
        System.out.println("Calling... " + phoneNumber);
    }

    void pickcall() {
        System.out.println("Connecting...");
    }
}

class SmartPhone extends MyCellPhone implements Mycamera, Mywifi {

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of network");
        String[] networkList = { "Jio", "Airtel", "Vodaphone", "Idea" };
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting... " + network);
    }

    @Override
    public void takesnap() {
        System.out.println("Taking Snap....");
    }

    @Override
    public void recordvideo() {
        System.out.println("Recording video...");
    }

}

public class Polymorphism_Interfaces {
    public static void main(String[] args) {
        Mycamera cam1 = new SmartPhone(); // This is a SmartPhone but use it as a camera !
        // cam1.getNetworks();---> Not Allowed
        cam1.recordvideo();
        SmartPhone sm = new SmartPhone();
        sm.takesnap();
        sm.getNetworks();
        sm.connectToNetwork(null);
        sm.callnumber(911);
        sm.pickcall();
    }
}
