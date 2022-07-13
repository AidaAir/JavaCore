package lesson4JavaCore;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {

    public static void main(String[] args) {
        seePhoneBook();
    }

    private static void seePhoneBook() {
        PhoneBook pb = new PhoneBook();
        pb.addElement("Ivanov", "89254567795");
        pb.addElement("Petrov", "89325892200");
        pb.addElement("Petrov", "81236985522");
        pb.addElement("Sidorov", "88524897469");
        pb.addElement("Krylova", "80264785536");

        System.out.println("Ivanov: " + pb.getName("Ivanov"));
        System.out.println("Petrov: " + pb.getName("Petrov"));
        System.out.println("Sidorov: " + pb.getName("Sidorov"));
        System.out.println("Krylova: " + pb.getName("Krylova"));
    }

    private final HashMap<String, HashSet<String>> phoneBook = new HashMap<>();

    public void addElement(String name, String phone) {
        HashSet<String> phones;
        if (phoneBook.containsKey(name)) {
            phones = phoneBook.get(name);
        } else {
            phones = new HashSet<>();
        }
        phones.add(phone);
        phoneBook.put(name, phones);
    }

    public Set<String> getName(String name) {
        return phoneBook.get(name);
    }
}

