
public class Employeebug {

    public static void main(String[] args) {

        int[] hours = { 40, 25, 50 };
        int rate = 1000;
        int total = 0;

        // Calculate total salary
        for (int i = 0; i < hours.length; i++) {
            total = total + hours[i] * rate;
        }

        // Calculate average salary
        double average = (double) total / hours.length;

        // Display results
        System.out.println("Total salary: " + total);
        System.out.println("Average salary: " + average);
    }
}
