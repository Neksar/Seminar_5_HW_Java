package Seminar_5_HW_Java;

import java.util.*;

public class PhoneBook {
    private HashMap<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }
    public void addContact(String name, String phone) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phone);
        } else {
            phoneBook.put(name, new ArrayList<>(Collections.singletonList(phone)));
        }
    }
    public List<String> getPhones(String name) {
        return phoneBook.get(name);
    }
    public void removeContact(String name) {
        phoneBook.remove(name);
    }
    public void updatePhone(String name, String oldPhone, String newPhone) {
        List<String> phones = phoneBook.get(name);
        if (phones != null) {
            int index = phones.indexOf(oldPhone);
            if (index >= 0) {
                phones.set(index, newPhone);
            }
        }
    }
    public HashMap<String, List<String>> getAllContacts() {
        return phoneBook;
    }
}
