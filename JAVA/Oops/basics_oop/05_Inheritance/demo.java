class Device {
    void powerOn() {
        System.out.println("Powering on the device.....");
    }
}
// Child class - 1
class dabbPhone extends Device {
    void makeCall() {
        System.out.println("Calling the number.....");
    }
}

// Child class - 2
class SmartPhone extends dabbPhone {
    void browseInternet() {
        System.out.println("Opening Browser.....");
    }
}

public class demo {
    public static void main(String[] args) {
        SmartPhone samsung = new SmartPhone();
        samsung.browseInternet();
        samsung.makeCall();
        samsung.powerOn();
    }
}