public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Shubhi");
        Student s3 = new Student(123);
    }

    class Student {
        String name;
        int roll_no;

    }

    Student(String name){
        this.name = name;
    }

    Student(int roll_no){
        this.roll_no = roll_no;
    }
}
