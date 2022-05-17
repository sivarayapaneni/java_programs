package Methos;

public class Teacher extends Student{
    public void run() {
        System.out.println("run the  bike");
    }

    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = new Student();
        s.run();
        t.run();

    }
}
