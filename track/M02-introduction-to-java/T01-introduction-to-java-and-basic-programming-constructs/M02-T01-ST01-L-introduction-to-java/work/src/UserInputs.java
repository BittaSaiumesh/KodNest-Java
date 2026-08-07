import java.util.*;
public class UserInputs {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Byte value");
        byte a = sc.nextByte();
        System.out.println("Enter short value");
        short b = sc.nextShort();
        System.out.println("Enter int value");
        int c = sc.nextInt();
        System.out.println("Enter long value");
        long d = sc.nextLong();
        System.out.println("Enter float value");
        float e = sc.nextFloat();
        System.out.println("Enter double value");
        double f = sc.nextDouble();
        System.out.println("Enter boolean value");
        boolean g = sc.nextBoolean();
        System.out.println("Enter char value");
        char h = sc.next().charAt(0);
        System.out.println("Enter String value");
        String i = sc.next();
        System.out.println("Byte value: " + a);
        System.out.println("Short value: " + b);
        System.out.println("Int value: " + c);
        System.out.println("Long value: " + d);
        System.out.println("Float value: " + e);
        System.out.println("Double value: " + f);
        System.out.println("Boolean value: " + g);
        System.out.println("Char value: " + h);
        System.out.println("String value: " + i);

    }
    
}
