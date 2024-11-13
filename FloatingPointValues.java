import java.util.Scanner;

public class FloatingPointValues {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double total = 0.0;
            double max = Double.NEGATIVE_INFINITY;
            double min = Double.POSITIVE_INFINITY;
            int count = 0;
            double interestRate = 0.20;

            System.out.println();
            
            // Prompt input 5 numbers 
            while (count < 5) {
                System.out.print("Enter a floating-point number (" + (count + 1) + "/5): ");
                if (scanner.hasNextDouble()) {
                    double value = scanner.nextDouble();
                    
                    // Update total
                    total += value;
                    
                    // Update max and min
                    if (value > max) {
                        max = value;
                    }
                    if (value < min) {
                        min = value;
                    }
                    
                    count++; // Increment count after successful input
                } else {
                    // If input is not a valid number, ask for input again
                    System.out.println("Invalid input. Please enter a valid floating-point number.");
                    scanner.next(); 
                }
            }
            
            // Calculate the average
            double average = total / 5;
            
            // Calculate interest on the total at 20%
            double interest = total * interestRate;
            
            // Print the results
            System.out.println("\nResults:");
            System.out.println("Total: " + total);
            System.out.println("Average: " + average);
            System.out.println("Maximum: " + max);
            System.out.println("Minimum: " + min);
            System.out.println("Interest on total at 20%: " + interest);
        }
    }
}
