import java.util.Scanner;

public class DynamicSimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Dynamic Simple Interest Calculator ===");
        System.out.println("1. Calculate Simple Interest (SI)");
        System.out.println("2. Calculate Principal Amount (P)");
        System.out.println("3. Calculate Rate of Interest (R)");
        System.out.println("4. Calculate Time Period (T)");
        System.out.print("Enter your choice (1-4): ");

        int choice = sc.nextInt();
        double P, R, T, SI;

        switch(choice) {
            case 1:
                System.out.print("Enter Principal (P): ");
                P = sc.nextDouble();
                System.out.print("Enter Rate (R): ");
                R = sc.nextDouble();
                System.out.print("Enter Time (T): ");
                T = sc.nextDouble();

                SI = (P * R * T) / 100;
                System.out.print("Simple Interest (SI) = " + SI);
                break;

            case 2:
                System.out.print("Enter Simple Interest (SI): ");
                SI = sc.nextDouble();
                System.out.print("Enter Rate (R): ");
                R = sc.nextDouble();
                System.out.print("Enter Time (T): ");
                T = sc.nextDouble();

                P = (SI * 100) / (R * T);
                System.out.println("Principal Amount (P) = " + P);
                break;

            case 3:
                System.out.print("Enter Simple Interest (SI): ");
                SI = sc.nextDouble();
                System.out.print("Enter Principal (P): ");
                P = sc.nextDouble();
                System.out.print("Enter Time (T): ");
                T = sc.nextDouble();

                R = (SI * 100) / (P * T);
                System.out.println("Rate of Interest (R) = " + R);
                break;

            case 4:
                System.out.print("Enter SI: ");
                SI = sc.nextDouble();
                System.out.print("Enter Principal: ");
                P = sc.nextDouble();
                System.out.print("Enter Rate: ");
                R = sc.nextDouble();

                T = (SI * 100) / (P * R);
                System.out.println("Time = " + T);
                break;

            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}