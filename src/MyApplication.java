package app;

import models.*;

import java.util.ArrayList;
import java.util.List;

public class MyApplication {

    public static void main(String[] args) {
        List<Payable> people = new ArrayList<>();
        people.add(new Employee("John", "Lennon", "Manager", 50000));
        people.add(new Student("Paul", "McCartney", 3.5));
        people.add(new Student("George", "Harrison", 2.5));

        printData(people);
    }

    public static void printData(Iterable<Payable> payables) {
        for (Payable payable : payables) {
            System.out.println(payable.toString() + " - Payment Amount: " + payable.getPaymentAmount());
        }
    }
}