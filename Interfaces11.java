
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
        System.out.println("Calling" + phoneNumber);
    }

    void pickcall() {
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends MyCellPhone implements Mycamera, Mywifi {

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of network");
        String[] networkList = { "Jio", "Airtel", "Vodaphone", "Idea" };
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting" + network);
        throw new UnsupportedOperationException("Unimplemented method 'connectToNetwork'");
    }

    @Override
    public void takesnap() {
        throw new UnsupportedOperationException("Unimplemented method 'takesnap'");
    }

    @Override
    public void recordvideo() {
        throw new UnsupportedOperationException("Unimplemented method 'recordvideo'");
    }

}

public class Interfaces11 {
    public static void main(String[] args) {
        MySmartPhone sm = new MySmartPhone();
        String[] ar = sm.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}
