package projects;

import java.util.Scanner;

public class FloatingPointValue {
    public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
	            float total = 0.0f;
	            float max = Float.NEGATIVE_INFINITY;
	            float min = Float.POSITIVE_INFINITY;
	            int count = 0;
	            float interestRate = 0.20f;

	            System.out.println();
	            
	            // Prompt input 5 numbers 
	            while (count < 5) {
	                System.out.print("Enter a floating-point number (" + (count + 1) + "/5): ");
	                if (scanner.hasNextFloat()) {
	                    float value = scanner.nextFloat();
	                    
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
	            float average = total / 5;
	            
	            // Calculate interest on the total at 20%
	            float interest = total * interestRate;
	            
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

