package hw8.PhoneBook;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {

    private HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.put(p.getPhone(), p);
    }

    @Override
    public Student searchByName(String name) {
        for (Student s : phoneBook.values()) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        return phoneBook.get(phone);
    }

    /**
     * @param phone
     */
    @Override
    public void deletePerson(String phone) {
        phoneBook.remove(phone);
    }

    @Override
    public Student searchByLastname(String lastname) {
        for (Student s : phoneBook.values()) {
            if (s.getLastname().equals(lastname)) {
                return s;
            }
        }
        return null;
    }


    public void deleteByNumber(String phone) {
        phoneBook.remove(phone);
    }

}