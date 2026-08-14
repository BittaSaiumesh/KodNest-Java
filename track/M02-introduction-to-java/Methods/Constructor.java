//Version-2: Copy Constructor:

class Student2{
    String name;
    int age;
    double height;
    Student2(String name,int age,double height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
    void display(){
        System.out.println(name);
        System.err.println(age);
        System.err.println(height);
    }
}
class Constructor{
    public static void main(String[] args) {
        Student2 s1=new Student2("Jaanu",18,5.2);
        s1.display();
    }
}
