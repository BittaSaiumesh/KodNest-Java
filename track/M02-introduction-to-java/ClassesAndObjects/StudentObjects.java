//package ClassesAndObjects;
class Student{
    String name;
    int age;
    double height;
    int rollNo;
    void run(){
        System.out.println("Running");
    }
    void sleep(){
        System.out.println("Sleeping");
    }
}
public class StudentObjects {
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.name="umesh";
        s1.age=20;
        s1.height=5.7;
        s1.rollNo=42;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.height);
        System.out.println(s1.rollNo);
        s1.run();
        s1.sleep();
    }
}
