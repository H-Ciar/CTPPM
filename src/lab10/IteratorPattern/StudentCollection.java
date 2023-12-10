package lab10.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class StudentCollection implements Iterable<Student> {
    List<Student> students;

    public StudentCollection() {
        students = new ArrayList<>();
        students.add(new Student("Alice"));
        students.add(new Student("Bob"));
        students.add(new Student("Charlie"));
    }

    @Override
    public Iterator<Student> iterator() {
        return (Iterator<Student>) new StudentIteratorImpl(this);
    }

    private class StudentIteratorImpl implements StudentIterator {

        int index;
        StudentCollection collection;

        public StudentIteratorImpl(StudentCollection collection) {
            this.collection = collection;
        }

        @Override
        public boolean hasNext() {
            return (index < collection.students.size());
        }

        @Override
        public Student next() {
            return collection.students.get(index++);
        }


    }
}

