public class Calculations {

    public static void main(String[] args) {

        // Write your code here

        double principal = 10000.0;
        double rate = 6.5;
        double years = 2.0;

        double si = (principal * rate * years) / 100.0;
        System.out.println("Simple Interest: " + si);

        double total = principal + si;
        System.out.println("Total Amount: " + total);

        double weight = 72.0;
        double height = 1.8;

        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);

        int totalmarks = 78 + 84 + 69 + 91 + 88;
        System.out.println("Total Marks: " + totalmarks);

        double percentage = (totalmarks * 100.0) / 500;
        System.out.println("Percentage: " + percentage);
    }
}