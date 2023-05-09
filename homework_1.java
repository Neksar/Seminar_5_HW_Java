package Seminar_5_HW_Java;

import java.util.*;

public class homework_1 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Максим Смирнов", "+7 123 456 78 90");
        phoneBook.addContact("Иван Петров", "+7 987 654 32 10");
        phoneBook.addContact("Светлана Иванова", "+7 111 222 33 44");

        List<String> maksimPhones = phoneBook.getPhones("Максим Смирнов");
        System.out.println("Телефоны Максима Смирнова: " + maksimPhones);

        phoneBook.removeContact("Светлана Иванова");

        phoneBook.updatePhone("Максим Смирнов", "+7 123 456 78 90", "+7 111 222 33 44");

        HashMap<String, List<String>> allContacts = phoneBook.getAllContacts();
        System.out.println("Все контакты: " + allContacts);
    }
}
