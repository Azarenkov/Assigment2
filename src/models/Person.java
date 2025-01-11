package models;

public class Person implements Payable, Comparable<Person> {

    private static int currentId = 0;

    private int id;
    private String name;
    private String surname;

    public Person() {
        generateId();
    }

    public Person(String name, String surname) {
        generateId();
        setName(name);
        setSurname(surname);
    }

    private void generateId() {
        this.id = ++currentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }
}
