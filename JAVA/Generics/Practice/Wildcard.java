package JAVA.Generics.Practice;

import java.util.*;

class Wildcard {

    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aravinth", "SJ", "VJ");
        List<Integer> nums = Arrays.asList(100, 99, 98);
        List<Double> prices = Arrays.asList(95.5, 99.6, 99.7);

        System.out.println("Names: ");
        printList(names);

        System.out.println("\nNumbers: ");
        printList(nums);

        System.out.println("\nPrices: ");
        printList(prices);
    }
}
