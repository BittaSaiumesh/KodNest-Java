package Methods;

import java.util.Scanner;

class StudentUtility {
    static double getPassingPercentage() {
        return 60.0;
    }

    static double calculatePercentage(int javaScore, int sqlScore) {
        double percentage = (double)(javaScore + sqlScore) / 2;
        return percentage;
    }
}

public class StudentPercentages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentUtility utility = new StudentUtility();

        // Add user interaction or calculations here
    }
}
