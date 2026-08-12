

class Employee{
    int id;
    String name;
    void work(){
        System.out.println(name+" is working");
    }    
}
public class EmpApplication {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.id=10;
        e1.name="Umesh";
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();
        Employee e2=new Employee();
        e1=e2;
        e2.id=20;
        e2.name="jaanu";
        System.out.println(e2.id);
        System.out.println(e2.name);
        e2.work();
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();
    }
    
}
