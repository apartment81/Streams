package ro.mirodone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String>  bingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12" , "B6",
                "J53", "J49", "J60", "J50", "j64","J125",
                "C26", "C17", "C29",
                "O71");

//        List<String > numbersToOrder = new ArrayList<>();
//
//        bingoNumbers.forEach(number -> {
//            if (number.toUpperCase().startsWith("J")) {
//                numbersToOrder.add(number);
//                // System.out.println(number);
//            }
//        } );
//
//        numbersToOrder.sort(String::compareTo);
//        numbersToOrder.forEach(s -> System.out.println(s));

        //print and sort using streams:

        bingoNumbers
                .stream()
                .map(String::toUpperCase)  //method reference same as : .map(s->s.toUpperCase())
                .filter(s->s.contains("C"))
                .sorted()
                .forEach(System.out::println);

    }
}
