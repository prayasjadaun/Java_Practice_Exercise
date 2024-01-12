 package codewithme;
class MyEmployee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class accessMod01 {
    public static void main(String[] args) {

        MyEmployee Prayas = new MyEmployee();
        Prayas.setName("Prayas Jadaun");
        System.out.println(Prayas.getName());
        Prayas.setId(25);
        System.out.println(Prayas.getId());
    }
}
