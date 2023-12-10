package week11.Ex11;

/** Class Staff:
 * Dẫn xuất từ (con của) lớp Person. Cần hoàn thiện các phương thức chưa có
 * nhưng phải giữ nguyên mẫu phương thức (khai báo, đối số, kiểu trả về)
 * Có thể thay đổi giá trị sau lệnh return cuối các phương thức nhưng cần
 * giữ nguyên kiểu trả về. Có thể bổ sung phương thức nếu cần, nhưng phải 
 * giữ lại đầy đủ các phương thức đã được khai báo sẵn
 * */

public class Staff extends Person{
    private String department = "Office";
    private Date recruitment = new Date();
    private double salary;

    public Staff(){
        super();
        salary = 375.0;
    }


    public Staff(String code, String mail, String dept, double salary, Date recruit,
                 String name, Date birthday, boolean gender, String address){

        super(code, name, birthday, gender, mail, address);
        this.department = dept;
        this.recruitment = recruit;
        this.salary = salary;
    }

    public String getDepartment(){
        // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        return department;
    }

    public double getSalary(){
        // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        return salary;
    }

    public int getSeniority(int currentYear) throws ArithmeticException{
        if(currentYear > recruitment.getYear())
            return currentYear - recruitment.getYear();
        else
            throw new ArithmeticException("Recruitment: Invalidate data! Year of birth has to be less than recruitment year!");

    }

    public double getRealEarnings(int currentYear){

        if(getSeniority(currentYear) > 5)
            return salary + salary * (getSeniority(currentYear) - 5)*3.75/100;
        else
            return salary;
    }


    public String toString(){
        String str = "Staff Code: ";
        str += super.toString();
        str += "; Recruit.:" + String.valueOf(recruitment.getYear()) + "; Salary:" + String.valueOf(salary) + "; Dept:" + department;
        return str;
    }

    public Date getRecruitment() {
        return recruitment;
    }
}