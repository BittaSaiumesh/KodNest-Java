class Student1{
    String name;
    int age;
    double height;
    void input(String name,int age,double height){
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
class Shadowing{
    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.input("umesh",20,5.3);
        s1.display();
    }
}
