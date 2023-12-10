package lab10.IteratorPattern;

public class IteratorDemo {
    public static void main(String[] args) {
        StudentCollection students = new StudentCollection();
        for(StudentIterator iter = students.iterator(); iter.hasNext(); ) {
            Student student = iter.next();
            System.out.println(student);
        }
    }
}
