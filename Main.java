import company.beans.Person;
import company.exceptions.InvalidAgeException;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Marek Mostowiak", 24);
            System.out.println("Osoba: " + person.getName() + ", Wiek: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}
