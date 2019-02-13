package ro.mirodone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> bingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "J53", "J49", "J60", "J50", "j64", "J125",
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
                .filter(s -> s.contains("C"))
                .sorted()
                .forEach(System.out::println);


//-------------------------------------------------------------------------------
        // testing stream .flatmap method
        Employee hulk = new Employee("Bruce Banner", 33);
        Employee barman = new Employee("Bruce Wayne ", 52);
        Employee spiderman = new Employee("Peter Parker", 23);
        Employee ironman = new Employee("Tony Stark", 42);

        Department avengers = new Department("Avengers");
        avengers.addEmployee(hulk);
        avengers.addEmployee(spiderman);
        avengers.addEmployee(ironman);
        Department justiceLeague = new Department (" Justice League");
        justiceLeague.addEmployee(barman);


        List<Department> departments = new ArrayList<>();
        departments.add(avengers);
        departments.add(justiceLeague);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

//-------------------------------------------------------------------------------
        // using .collect method and we have a list we  can use it further
        List<String> sortedGNumbers = bingoNumbers
                .stream()
                .map(String ::toUpperCase)
                .filter(s -> s.startsWith("J"))
                .sorted()
                .collect(Collectors.toList());

        for (String s: sortedGNumbers) {
            System.out.println(s);
        }
//-  find the youngest employee
        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1, e2) -> e1.getAge() <e2.getAge() ? e1 :e2)
                .ifPresent(System.out::println);

    }








}
