import ContactPackage.Contact;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome,Sir.");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();
        int a = 0;
        while (a < 26) {
            System.out.println("Show Contact-->1: Add Contact-->2: Find Contact-->3: Remove Contact-->4: Sort Contacts by Number-->5: Sort Contact by Name -->6");
            int btn = scanner.nextInt();
            scanner.nextLine();

            if (btn == 1) {
                for (Contact contact : contacts) {
                    System.out.println("Name:" + contact.getName() + " PhoneNumber:" + contact.getPhoneNumber());
                }

            } else if (btn == 2) {
                System.out.print("Enter the name:");
                String name = scanner.nextLine();
                System.out.print("Enter the phonenumber:");
                String phoneNumber = scanner.nextLine();
                Contact newContact = new Contact();
                newContact.setNamePhoneNumber(name, phoneNumber);
                contacts.add(newContact);
                System.out.println("Contact added succesfully.");


            } else if (btn == 3) {
                System.out.println("Please enter name that you want to find number:");
                String findNumber = scanner.nextLine();
                for (Contact contact : contacts) {
                    if (contact.getName().equals(findNumber)) {
                        System.out.println(contact.getPhoneNumber());
                        break;
                    } else {
                        System.out.println("there is not person that you search");
                    }
                }

            } else if (btn == 4) {
                System.out.println("Please enter phoneNumber or name that you want remove.");
                String toRemove = scanner.nextLine();
                contacts.removeIf(contact -> contact.getName().equals(toRemove) || contact.getPhoneNumber().equals(toRemove));
                System.out.println("Contact removed Succesfully if it exist!");

            } else if (btn == 5) {
                contacts.sort((c1, c2) -> c1.getPhoneNumber().compareTo(c2.getPhoneNumber()));
                for (Contact contact : contacts) {
                    System.out.println("Name:" + contact.getName() + " PhoneNumber:" + contact.getPhoneNumber());
                }

            } else if (btn == 6) {
                contacts.sort((c1, c2) -> c1.getName().compareTo(c2.getName()));
                for (Contact contact : contacts) {
                    System.out.println("Name:" + contact.getName() + " PhoneNumber:" + contact.getPhoneNumber());
                }

            } else {
                System.out.println("Sorry,but there is not another function.");
            }
            a += 1;
        }

    }
}