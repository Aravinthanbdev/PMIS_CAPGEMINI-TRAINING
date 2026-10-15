package JAVA.Generics;

public class Demo {
    static class Box {
    private Object value;

    Object get() {
        return value;
    }

    void set(Object value) {
        this.value = value;
    }
}

class gen {
    public static void main(String[] args) {
        Box box = new Box();
        box.set("bhumi");
        String s = (String) box.get();
        System.err.println(s);
        box.set(43);
    }
}
}
