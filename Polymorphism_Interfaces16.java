
interface camera {
    void takesnap();

    void recordvideo();
}

interface wifi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class CellPhone {
    void callnumber(int phoneNumber) {
        System.out.println("Calling... " + phoneNumber);
    }

    void pickcall() {
        System.out.println("Connecting...");
    }
}

class MSmartPhone extends CellPhone implements camera, wifi {

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

public class Polymorphism_Interfaces16 {
    public static void main(String[] args) {
        camera cam1 = new MSmartPhone(); // This is a SmartPhone but use it as a camera !
        // cam1.getNetworks();---> Not Allowed
        cam1.recordvideo();
        MSmartPhone sm = new MSmartPhone();
        sm.takesnap();
        sm.getNetworks();
        sm.connectToNetwork(null);
        sm.callnumber(911);
        sm.pickcall();
    }
}
