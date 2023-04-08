package Homework1;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression");
        System.out.println("Enter path to expression");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            String expression = scanner.nextLine();
            System.out.println("Result of the provided expression is: " + Algorithm.calculate(expression));
        } else if (choice == 2) {
            String filePath = scanner.nextLine();
            ArrayList<Double> results = Algorithm.calculateFromFile(filePath);
            for (Double result : results) {
                System.out.println("Result of the provided file expressions is: " + result);
            }
        }
    }
}
