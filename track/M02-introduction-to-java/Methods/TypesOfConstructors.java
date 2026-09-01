
class Student3{
    String name;
    int age;
    double height;
    Student3(String name,int age,double height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
    Student3(String name){
        this.name=name;
       
    }
    Student3(){
        this.name="Jayanthi";
        this.age=21;
        this.height=4.2;
    }
    void display(){
        System.out.println(name);
        System.err.println(age);
        System.err.println(height);
    }
}
public class TypesOfConstructors{
    
    public static void main(String[] args) {
        Student3 s1=new Student3("Umesh");
        s1.display();
        Student3 s2=new Student3("Jaanu",18,5.2);
        s2.display();
        Student3 s3=new Student3();
        s3.display();
    }
}
