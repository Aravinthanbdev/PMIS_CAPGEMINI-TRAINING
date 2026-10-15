package JAVA.Realationship;
class Battery {

    int capacity;

    Battery(int capacity) {
        this.capacity = capacity;
    }

    void drain() {
        System.out.println("Battery drained by " + capacity + " mAh");
    }
}
class Camera {

    int pix;

    Camera(int pix) {
        this.pix = pix;
    }

    void takePhoto() {
        System.out.println("Click... Captured a photo with " + pix + " sensor");
    }
}

class Phone {
    String brand;
    Battery battery;
    Camera camera;

    Phone(String brand, Battery battery, Camera camera) {
        this.brand = brand;
        this.battery = battery;
        this.camera = camera;
    }

    void snapPicture() {
        System.out.println("[" + brand + "] is active.");
        camera.takePhoto();
        battery.drain();
    }
}
class Relationship3 {
    public static void main(String[] args) {
        Battery battery = new Battery(4000);
        Camera camera = new Camera(108);
        Phone phone = new Phone("Samsung", battery, camera);

        phone.snapPicture();
    }
}