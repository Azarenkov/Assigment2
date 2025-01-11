import models.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyApplication {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Employee("John", "Lennon", "Manager", 50000));
        people.add(new Employee("Ringo", "Starr", "Developer", 40000));
        people.add(new Student("Paul", "McCarney", 3.5));
        people.add(new Student("George", "Harrison", 2.5));
        people.add(new Student("Mick", "Jagger", 2.0));

        Collections.sort(people);

        printData(people);
    }

    public static void printData(List<Person> people) {
        for (Payable payable : people) {
            System.out.printf("%s%n earns %.2f tenge%n", payable.toString(), payable.getPaymentAmount());
        }
    }
}