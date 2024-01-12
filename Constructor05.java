package codewithme;
class MyNewEmployee {
    private int id;
    private String name;
    private int salary;

    public MyNewEmployee(String myname, int myId, int mysalary) {
        id = myId;
        name = myname;
        salary = mysalary;
    }
    public String getName() { return name;}
    public void setName(String n) { this.name = n;}
    public int getId() { return id; }
    public void setId(int i) { this.id = i;}
    public int getSalary(){ return salary;}
    public void setSalary(int salary){ this.salary = salary;}
}

public class Constructor05 {
    public static void main(String[] args) {

        MyNewEmployee Prayas = new MyNewEmployee("Prayas Jadaun",25,10000000);
        System.out.println(Prayas.getName());
        System.out.println(Prayas.getId());
        System.out.println(Prayas.getSalary());
    }
}
