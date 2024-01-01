
class Employee {
    int id;
    int salary;
    String name;

    public void EmployeeDetails() {
        System.out.println("My Name is " + name);
        System.out.println("My Id is " + id);
    }

    public int getSalary() {
        return salary;

    }
}

public class OOps {
    public static void main(String[] args) {
        Employee Prayas = new Employee();
        Employee Krishna = new Employee();

        Prayas.name = "Prayas Jadaun";
        Prayas.id = 25;
        Prayas.salary = 1200000;
        Prayas.EmployeeDetails();

        int salary = Prayas.getSalary();
        System.out.println("My Average salary "+salary);
        
        Krishna.name = "Krishna Chauhan";
        Krishna.id = 48;
        Krishna.salary = 1000000;
        Krishna.EmployeeDetails();

    }
}
