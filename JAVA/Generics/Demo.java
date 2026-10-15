package JAVA.Generics;

public class Demo {
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
        Demo box = new Demo();
        box.set("bhumi");
        String s = (String) box.get();
        System.err.println(s);
        box.set(43);
    }
}

