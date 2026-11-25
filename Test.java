public class Test {

    public class Main {

        // Calculates salary by multiplying hours with rate
        public static int calculateSalary(int hours, int rate) {
            return hours * rate;
        }

        // Returns employee category according to salary
        public static String getCategory(int salary) {
            if (salary >= 50000) {
                return "High";
            } else if (salary >= 30000) {
                return "Medium";
            } else {
                return "Low";
            }
        }

        // Checks whether working hours are between 0 and 60
        public static boolean isValid(int hours) {
            return hours >= 0 && hours <= 60;
        }

        public static void main(String[] args) {

            String[] names = { "Hina", "Omar", "Zara", "Bilal" };
            int[] hours = { 40, 25, 70, 55 };

            int rate = 1000;
            int validEmployees = 0;
            int totalSalary = 0;

            for (int i = 0; i < names.length; i++) {

                if (isValid(hours[i])) {

                    int salary = calculateSalary(hours[i], rate);
                    String category = getCategory(salary);

                    System.out.println(names[i] + ": " +
                            hours[i] + " hours, Rs " +
                            salary + " " + category);

                    validEmployees++;
                    totalSalary += salary;

                } else {
                    System.out.println("Invalid hours for " + names[i]);
                }
            }

            double averageSalary = (double) totalSalary / validEmployees;

            System.out.println("\nValid employees: " + validEmployees);
            System.out.println("\nTotal salary: " + totalSalary);
            System.out.println("\nAverage salary: " + averageSalary);
        }
    }

}
