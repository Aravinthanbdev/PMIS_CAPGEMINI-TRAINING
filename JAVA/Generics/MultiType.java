package JAVA.Generics;

public class MultiType <K,V> {
    // Multi type parameters

    private K key;
    private V value;

    MultiType(K key, V value) {
        this.key = key;
        this.value = value;
    }

    K getKey() {
        return key;
    }

    V getValue() {
        return value;
    }
}

class gen {
    public static void main(String[] args) {
        MultiType<String, Integer> p = new MultiType<String, Integer>("Age", 25);

        String k = p.getKey();
        Integer v = p.getValue();

        System.out.println(k + ":" + v);
    }
}

