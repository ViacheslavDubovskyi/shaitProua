package hw5_list.phonebook;

public class Main {

    public static void main(String[] args) {

        Record bob = new Record("Bob", 380993503232L);
        Record alice1 = new Record("Alice", 380638208232L);
        Record matt = new Record("Matt", 380993503232L);
        Record alice2 = new Record("Alice", 380747207575L);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(bob);
        phoneBook.add(alice1);
        phoneBook.add(matt);
        phoneBook.add(alice2);

        System.out.println("1." + phoneBook.find("Alice"));
        System.out.println("2." + phoneBook.find("Nick"));
        System.out.println("3." + phoneBook.findAll("Alice"));
        System.out.println("4." + phoneBook.findAll("Jack"));

    }
}
