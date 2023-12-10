package week11.Ex11; /** Class EduCenter:
 * Lớp dùng để gọi thực hiện và kiểm thử các lớp đã xây dựng trước đó. 
 * Cần hoàn thiện các phương thức chưa đầy đủ nhưng phải giữ nguyên mẫu
 * phương thức (khai báo, đối số, kiểu trả về). Có thể thay đổi giá trị 
 * sau lệnh return cuối các phương thức nhưng cần giữ nguyên kiểu trả về. 
 * Có thể bổ sung phương thức nếu cần, nhưng phải giữ lại đầy đủ các phương thức đã được khai báo sẵn
 * */


import java.util.Scanner;
import java.util.ArrayList;

public class EduCenter{
    public static int currentYear;
    public static double baseAmount;

    public static Person[] readData(Scanner scan){

        int n = Integer.parseInt(scan.nextLine());
        Person[] listPerson = new Person[n];

        try {
            for (int i = 0; i < n; i++) {
                String personCode = scan.nextLine();

                // Khởi tạo đối tượng
                if (personCode.startsWith("1")) {
                    // Sinh viên
                    String name = scan.nextLine();
                    Date birthday = new Date(Integer.parseInt(scan.next()), Integer.parseInt(scan.next()), Integer.parseInt(scan.next()));
                    scan.nextLine();
                    boolean gender = Boolean.parseBoolean(scan.nextLine());
                    String email = scan.nextLine();
                    String address = scan.nextLine();
                    double score = Double.parseDouble(scan.nextLine());
                    String majors = scan.nextLine();

                    listPerson[i] = new Student(personCode, email, majors, score, name, birthday, gender, address);
                } else {
                    // Nhân viên
                    String name = scan.nextLine();
                    Date birthday = new Date(Integer.parseInt(scan.next()), Integer.parseInt(scan.next()), Integer.parseInt(scan.next()));
                    scan.nextLine();
                    boolean gender = Boolean.parseBoolean(scan.nextLine());
                    String email = scan.nextLine();
                    String address = scan.nextLine();
                    String department = scan.nextLine();
                    double salary = Double.parseDouble(scan.nextLine());
                    Date recruitment = new Date(Integer.parseInt(scan.next()), Integer.parseInt(scan.next()), Integer.parseInt(scan.next()));
                    scan.nextLine();

                    listPerson[i] = new Staff(personCode, email, department, salary, recruitment, name, birthday, gender, address);
                }

                // Kiểm tra dữ liệu
                if (listPerson[i] instanceof Student) {
                    Student student = (Student) listPerson[i];
                    if (student.getScore() < 0 || student.getScore() > 10) {
                        throw new ArithmeticException("Invalid data! Score must be in range [0, 10]");
                    }
                } else if (listPerson[i] instanceof Staff) {
                    Staff staff = (Staff) listPerson[i];
                    if (staff.getRecruitment().getYear() < currentYear) {
                        throw new ArithmeticException("Invalid data! Recruitment year must be greater than or equal to current year");
                    }
                }
            }
        } catch (ArithmeticException ArtmExcp) {
            System.out.print(ArtmExcp.getMessage());
            return null;
        } catch (Exception Excp) {
            System.out.println("Data types mismatch!");
            return null;
        }

        return listPerson;
    }


    public static ArrayList<Person> listOfStaff(Person[] listPerson) {

        ArrayList<Person> results = new ArrayList<Person>();

        for (Person person : listPerson) {
            if (person instanceof Staff) {
                results.add(person);
            }
        }

        return results;
    }

    public static void sortStaffBySalary(ArrayList<Person> listStaff) {

        Staff tmp;
        int n = listStaff.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++) {
                Staff staffI = (Staff) listStaff.get(i);
                Staff staffJ = (Staff) listStaff.get(j);
                if (staffI.getSalary() > staffJ.getSalary()) {
                    tmp = (Staff) listStaff.get(i);
                    listStaff.set(i, listStaff.get(j));
                    listStaff.set(j, tmp);
                }
            }
    }

    public static void sortStudentByScore(ArrayList<Person> listStudent){

        Student tmp;
        int n = listStudent.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++) {
                Student studentI = (Student) listStudent.get(i);
                Student studentJ = (Student) listStudent.get(j);
                if (studentI.getScore() < studentJ.getScore()) {
                    tmp = (Student) listStudent.get(i);
                    listStudent.set(i, listStudent.get(j));
                    listStudent.set(j, tmp);
                }
            }
    }

    public static ArrayList<Person> listOfStudent(Person[] listPerson){

        ArrayList<Person> results = new ArrayList<Person>();

        for (Person person : listPerson) {
            if (person instanceof Student) {
                results.add(person);
            }
        }

        return results;
    }

    public static Person searchByCode(Person[] listPerson, String code){

        for (Person person : listPerson) {
            if (person.getCode().equals(code)) {
                return person;
            }
        }

        return null;
    }


    // Phương thức theo yêu cầu ở mục 4.2 trong mô tả
    public static void displayList(Person[] listPerson) {
        if (listPerson != null) {
            System.out.println("------------------------");
            for (int i = 0; i < listPerson.length; i++) {
                if (listPerson[i].getClass().getSimpleName().equals("Staff")) {
                    Staff staff = (Staff) listPerson[i];
                    System.out.println(staff.toString() + " Income: " + String.valueOf(staff.getRealEarnings(currentYear)));
                } else {
                    Student student = (Student) listPerson[i];
                    System.out.println(student.toString() + " Total Fees: " + String.valueOf(student.getPayment(baseAmount)));
                }
            }
            System.out.println("------------------------");
        } else {
            System.out.println("No any person in this list!");
        }
    }



    // Phương thức theo yêu cầu ở mục 4.3 trong mô tả
    public static void displayList(ArrayList<Person>  listPerson){
        // Bổ sung mã lệnh để phương thức này có thể thông tin ra màn hình đúng theo mẫu
        // cả trường hợp Student và Staff
        int n = listPerson.size();
        if(n > 0){

            for (int i = 0; i < n; i ++){
                if(listPerson.get(i).getClass().getSimpleName().equals("Staff")){
                    /* Đặt staff = (Staff)(đối tượng thứ i). Bổ sung lệnh để in ra xâu ký tự theo mẫu sau:
                    staff.toString() + " Income:" + String.valueOf(staff.getRealEarnings(currentYear)) */
                }else{
                    /* Đặt student = (Student)(đối tượng thứ i). Bổ sung lệnh để in ra xâu ký tự theo mẫu sau:
                    student.toString() + " Total Fees:" + String.valueOf(student.getPayment(baseAmount) ) */;
                }
            }
        } else{
            System.out.println("No any person in this list!");
        }
    }


    public static void sortByLastName(Person[] listPerson){

        Person tmp;
        int n = listPerson.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++) {
                Person personI = listPerson[i];
                Person personJ = listPerson[j];
                if (personI.getLastName().compareTo(personJ.getLastName()) > 0) {
                    tmp = listPerson[i];
                    listPerson[i] = listPerson[j];
                    listPerson[j] = tmp;
                }
            }
    }


    public static ArrayList<Person> searchByMajors(Person[] listPerson, String majors){

        ArrayList<Person> results = new ArrayList<>();

        for (Person person : listPerson) {
            if (person instanceof Student && ((Student) person).getMajors().equals(majors)) {
                results.add(person);
            }
        }

        return results;
    }


    public static void main(String Ag[]){
        Scanner scan = new Scanner(System.in);
        int currentYear = scan.nextInt();

        // Đọc dữ liệu
        Person[] listPerson = readData(scan);

        // Thực hiện các yêu cầu
        if (listPerson != null) {
            // In danh sách tất cả (cả Sinh viên và Nhân viên)
            displayList(listPerson);

            // Sắp xếp danh sách Sinh viên theo điểm
            ArrayList<Person> listStudent = listOfStudent(listPerson);
            sortStudentByScore(listStudent);
            displayList(listStudent);

            // Tìm kiếm Nhân viên theo mã code
            System.out.println("Enter person code: ");
            String code = scan.nextLine();
            Person person = searchByCode(listPerson, code);
            if (person != null) {
                System.out.println("Person found: " + person.toString());
            } else {
                System.out.println("Person not found!");
            }

            // Liệt kê các Sinh viên cùng chuyên ngành
            System.out.println("Enter majors: ");
            String majors = scan.nextLine();
            ArrayList<Person> studentsByMajors = searchByMajors(listPerson, majors);
            displayList(studentsByMajors);
        }

        // Dọn dẹp
        scan.close();
    }


}