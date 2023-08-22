package de.telran.mgvozdev.prof.hw6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecretaryHelper {

    public static void main(String[] args) {
        List<Person> contacts = new ArrayList<>();
        contacts.add(new Person("Вася", "Пупкин", "987654"));
        contacts.add(new Person("Петя", "Пупкин", "987987"));
        contacts.add(new Person("Вася", "Пенков", "123456"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter surname: ");
        String searchLastName = scanner.nextLine();
        List<String> phoneNumbers = findPhoneNumbersByLastName(contacts, searchLastName);
        printFoundNumbers(phoneNumbers);
    }

    public static List<String> findPhoneNumbersByLastName(List<Person> contacts, String lastName) {
        List<String> foundPhoneNumbers = new ArrayList<>();
        for (Person person : contacts) {
            if (person.getLastName().equalsIgnoreCase(lastName)) {
                foundPhoneNumbers.add(person.getPhoneNumber());
            }
        }
        return foundPhoneNumbers;
    }

    private static void printFoundNumbers(List<String> phoneNumbers) {
        if (!phoneNumbers.isEmpty()) {
            System.out.println("Numbers:");
            for (String phoneNumber : phoneNumbers) {
                System.out.println(phoneNumber);
            }
        } else {
            System.out.println("No numbers found");
        }
    }
}
