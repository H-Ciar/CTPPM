package lab4.theemployee;

public class TestMain {
    public static void main(String[] args) {
        // Test constructer() and toString()
        Employee employee1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(employee1);

        //Tets setter and getter
        employee1.setSalary(999);
        System.out.println(employee1);
        System.out.println(employee1.getId());
        System.out.println(employee1.getFirstName());
        System.out.println(employee1.getLastName());
        System.out.println(employee1.getSalary());
        System.out.println(employee1.getName());
        System.out.println(employee1.getAnnualSalary());

        // Test rauseSalary()
        System.out.println(employee1.raiseSalary(10));
        System.out.println(employee1);
    }
}
