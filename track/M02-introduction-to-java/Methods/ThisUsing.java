
class Student{
    String name;
    int age;
    int rollno;
    double height;
    void input(String name,int age,int rollno,double height){
        this.name=name;
        this.age=age;
        this.rollno=rollno;
        this.height=height;

    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Roll No: "+rollno);
        System.out.println("Height: "+height);

    }
}
public class ThisUsing {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.input("Umesh",20,42,5.3);
        s1.display();
    }
    
}
