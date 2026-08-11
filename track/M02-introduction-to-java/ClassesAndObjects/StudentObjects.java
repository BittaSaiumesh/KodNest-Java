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
        Student s2 = new Student();
        s2.name="rani";
        s2.age=20;
        s2.height=5.7;
        s2.rollNo=42;
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.height);
        System.out.println(s2.rollNo);
        s2.run();
        s2.sleep();

        Student s3=new Student();
        s3.name="suresh";
        s3.age=20;
        s3.height=5.7;
        s3.rollNo=42;
        System.out.println(s3.name);
        System.out.println(s3.age);
        System.out.println(s3.height);
        System.out.println(s3.rollNo);
        s3.run();
        s3.sleep();
        
    }
}
