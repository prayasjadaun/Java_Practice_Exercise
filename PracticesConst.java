class Student {
    private String Name;
    private int RollNo;
    private String Course;
    private int Age;
    private String Gender;

    public Student(int RollNo, String Name, String Course, int Age, String Gender) {
        this.Name = Name;
        this.RollNo = RollNo;
        this.Course = Course;
        this.Age = Age;
        this.Gender = Gender;

    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int RollNo) {
        this.RollNo = RollNo;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

}

public class PracticesConst {
    public static void main(String[] args) {
        Student student = new Student(25, "Prayas Jadaun", "MCA", 23, "Male");
        System.out.println(student.getName());
        System.out.println(student.getRollNo());
        System.out.println(student.getCourse());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
    }
}
