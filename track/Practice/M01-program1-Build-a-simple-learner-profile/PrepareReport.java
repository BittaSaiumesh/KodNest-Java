public class PrepareReport {

    public static void main(String[] args) {

        int solvedProblems = 47;
        int practiceDays = 5;
        double exactPercentage = 86.75;

        double averagePerDay = (double) solvedProblems / practiceDays;

        System.out.println("Report Value: " + (double) solvedProblems);
        System.out.println("Whole Percentage: " + (int) exactPercentage);
        System.out.println("Average Per Day: " + averagePerDay);

        if (averagePerDay >= 9.0) {
            System.out.println("Daily Target Reached: true");
        } else {
            System.out.println("Daily Target Reached: false");
        }

        
    }
}