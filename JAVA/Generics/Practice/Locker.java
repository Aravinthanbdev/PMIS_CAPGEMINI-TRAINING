package JAVA.Generics.Practice;

class Locker<T> {
    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}

class gen {
    public static void main(String[] args) {
        Locker<String> bookLocker = new Locker<>();
        bookLocker.put("Java Book");
        System.out.println("Locker has: " + bookLocker.get());

        Locker<Integer> codeLocker = new Locker<>();
        codeLocker.put(1234);
        System.out.println("Locker has: " + codeLocker.get());
    }
}