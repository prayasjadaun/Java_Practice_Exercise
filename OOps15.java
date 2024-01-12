//Problem 1------------------------------------------
/*
 
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
//Problem----------------------------------------------------------

class Square {
    int side;

    public int area() {
        return side * side;
    }
    
    public int perimeter() {
        return 4 * side;
    }
}

public class OOps {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
//Problem-----------------------------------------
public class OOps {
    class Rectangle {
        int length;
        int width;

        public int area() {
            return width * length;
        }
        public int perimeter() {
            return 2 * (length + width);
        }
    }
    public static void main(String[] args) {
        OOps oops = new OOps();
        OOps.Rectangle rc = oops.new Rectangle();
        
        rc.length = 3;
        rc.width = 2;
        
        System.out.println(rc.area());
        System.out.println(rc.perimeter());
    }
}
*/
//Problem Circle-----------------------------------------
public class OOps15{
    class Circle{
        double pi = 3.14;
        int r ;
        public double area(){
            return pi*(r*r);
        }
        public double perimeter(){
            return 2*(pi*r);
        }
    }
    public static void main(String[]args){
        OOps15 oops =  new OOps15();
        OOps15.Circle cr = oops.new Circle();
        cr.r = 3;
        System.out.println(cr.area());
        System.out.println(cr.perimeter());
    }
}