package weeklyAverage;

import java.util.Scanner;

public class AverageWithholding {
	public static void main (String[] args) {
		Scanner scnr = new Scanner(System.in);
		double weeklyIncome;
		double taxRate = 0.0;
		
		System.out.println("Calculate Average Withholding.");
		System.out.println("Enter weekly income: ");
		weeklyIncome = scnr.nextInt();
		
		if(weeklyIncome < 500) {
			taxRate = 0.10;
		}
		else if (weeklyIncome >= 500 && weeklyIncome <= 1500) {
			taxRate = 0.15;
		}
		else if (weeklyIncome >= 1500 && weeklyIncome <= 2500) {
			taxRate = 0.20;
		}
		else {
			taxRate = 0.30;
		}
		
		double averageWithholding = weeklyIncome * taxRate;
		
		System.out.printf("Weekly income: $%.2f\n", weeklyIncome);
        System.out.printf("Tax rate: %.0f%%\n", taxRate * 100);
        System.out.printf("Average withholding: $%.2f\n", averageWithholding);

        scnr.close();
	}
}