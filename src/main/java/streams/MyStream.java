package streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyStream {

    // there are two type's of streams
    // 1 is intermediate  2nd terminal

    // intermediate
    /**
     * filter
     * map
     * flatmap
     * distinct
     * sorted
     * limit
     * skip
     */


    // terminal
    /**
     * forEach
     * collect
     * reduce
     * count
     * anymatch/allMatch/noneMatch
     * findFirst/ findAny
     */

      static class Employee{
        String name;
        int age;
        double salary;
        Employee(String name, int age, double salary){
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }

        public int getAge() {
            return age;
        }
        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();
         employees.add( new Employee("yogesh", 23, 3500.00));
        employees.add( new Employee("billa", 24, 3100.00));
        employees.add( new Employee("balu", 29, 3300.00));
        employees.add( new Employee("teja", 21, 3900.00));
        employees.add( new Employee("siri", 22, 3200.00));
        employees.add( new Employee("junnu", 4, 3700.00));


        // add all the numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-100);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);

        // for min and max use optional<t> return type so use optional type only
     Optional<Integer> n =  numbers.stream().min((h, x) -> (h-x));
     System.out.println(n);

        Integer i = numbers.stream().limit(10).reduce(0, (a,b) -> a + b);
        System.out.println(i);


//        List<String> list = employees.stream().filter(employee -> (employee.getAge() > 20)).filter(employee -> (employee.getSalary() > 2000))
//                .map(employee -> employee.getName())
//                .collect(Collectors.toList());
//
//        list.stream().forEach(System.out::println);

        List<String> list = employees.stream().filter(a -> a.getName().startsWith("b")).map(b -> b.getName()).collect(Collectors.toList());

        list.stream().forEach(System.out::println);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("yogi", 5);
        map.put("teja",23);
        map.put("balu",29);
        map.put("siri",21);



    }
}
