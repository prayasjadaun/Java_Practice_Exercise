
class MyNewEmployee {
    private int id;
    private String name;

    public MyNewEmployee(String myname, int myId) {
        id = myId;
        name = myname;
    }
    public String getName() { return name;}
    public void setName(String n) { this.name = n;}
    public void setId(int i) { this.id = i;}
    public int getId() { return id; }
}

public class Constructor {
    public static void main(String[] args) {

        MyNewEmployee Prayas = new MyNewEmployee("Prayas Jadaun",25);
        // Prayas.setName("Prayas Jadaun");
        System.out.println(Prayas.getName());
        // Prayas.setId(25);
        System.out.println(Prayas.getId());
    }
}
