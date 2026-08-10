import java.util.Scanner;

public class InputWithConditionsAndLoops {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the number of days
        String status = null;
        int totalProblemsSolved = 0;

        int practicedays = scanner.nextInt();

        for (int i = 0; i < practicedays; i++) {
            int problemsEachDay = scanner.nextInt();
            totalProblemsSolved += problemsEachDay;
        }

        if (totalProblemsSolved >= 20) {
            status = "Strong progress";
        } else if (totalProblemsSolved >= 10 && totalProblemsSolved <= 19) {
            status = "Keep improving";
        } else {
            status = "Needs more practice";
        }

        // Calculate the total and display the progress status
        System.out.println("Total solved: " + totalProblemsSolved);
        System.out.println("Status: " + status);

        scanner.close();
    }
}