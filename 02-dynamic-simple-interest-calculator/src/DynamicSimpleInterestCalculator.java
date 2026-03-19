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
                System.out.println("Enter Principal Amount (P): ");
                P = sc.nextDouble();
        }
    }
}