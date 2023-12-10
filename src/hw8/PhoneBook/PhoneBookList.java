package hw8.PhoneBook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {

    private ArrayList<Student> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.add(p);
    }

    @Override
    public Student searchByName(String name) {
        for (Student s : phoneBook) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastname(String lastname) {
        for (Student s : phoneBook) {
            if (s.getLastname().equals(lastname)) {
                return s;
            }
        }
        return null;
    }


    @Override
    public Student searchByNumber(String phone) {
        for (Student s : phoneBook) {
            if (s.getPhone().equals(phone)) {
                return s;
            }
        }
        return null;
    }
    /**
     * @param phone
     */

    @Override
    public void deletePerson(String phone) {
        Student toRemove = null;
        for (Student s : phoneBook) {
            if (s.getPhone().equals(phone)) {
                toRemove = s;
                break;
            }
        }

        if (toRemove != null) {
            phoneBook.remove(toRemove);
        }
    }


    public void deleteByNumber(String phone) {
        Student toRemove = null;
        for (Student s : phoneBook) {
            if (s.getPhone().equals(phone)) {
                toRemove = s;
                break;
            }
        }

        if (toRemove != null) {
            phoneBook.remove(toRemove);
        }
    }

}