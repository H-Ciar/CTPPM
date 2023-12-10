package week11.Ex11;

/** Class Student:
 * Dẫn xuất từ (con của) lớp Person. Cần hoàn thiện các phương thức chưa có
 * nhưng phải giữ nguyên mẫu phương thức (khai báo, đối số, kiểu trả về)
 * Có thể thay đổi giá trị sau lệnh return cuối các phương thức nhưng cần
 * giữ nguyên kiểu trả về. Có thể bổ sung phương thức nếu cần, nhưng phải 
 * giữ lại đầy đủ các phương thức đã được khai báo sẵn
 * */

public class Student extends Person{
    private String  majors = "UnRegistered";
    private double scoreAvg;

    public Student(){
        super();
        scoreAvg = 0.0;
    }


    public Student(String SVcode, String mail, String majors, double score,
                   String name, Date birthday, boolean gender, String address){

        super(SVcode, name, birthday, gender, mail, address);
        this.majors = majors;
        this.scoreAvg = score;
    }


    public String getMajors(){
        return majors;
    }


    public double getScore(){
        // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        return scoreAvg;
    }

    public double getPayment(double baseAmount){

        if(scoreAvg < 4.0)
            return baseAmount * 1.5;
        else if(scoreAvg >= 8.0)
            return baseAmount * 0.75;
        else
            return baseAmount;
    }



    public String toString(){
        String str = "Student Code: ";
        str = super.toString();
        str += "; AVG score:" + String.valueOf(scoreAvg) + " Majors: " + majors;
        return str;
    }


}