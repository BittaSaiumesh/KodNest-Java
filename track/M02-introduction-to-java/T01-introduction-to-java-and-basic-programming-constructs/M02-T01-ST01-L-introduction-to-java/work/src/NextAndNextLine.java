import java.util.*;
public class NextAndNextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= sc.nextInt();
        System.out.println("Age: "+age);
        System.out.println("Enter your height: ");
        float height= sc.nextFloat();
        System.out.println("Height: "+height);
        sc.nextLine();//we are using sc.nextLine() to consume the leftover newline characters
        System.out.println("Enter your full name: ");
        String name= sc.nextLine();
        System.out.println("Full Name: "+name);
        sc.close();

    }
    
}
