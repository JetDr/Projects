import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperatures {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();
        
        // Define the days of the week
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
        // Prompt the user to enter the temperature for each day of the week

            // Create a Scanner object to get user input
                Scanner scanner = new Scanner(System.in); {

            // Prompt the user to enter the temperature for each day of the week
            for (String weekDay : weekDays) {
                System.out.print("Enter the average temperature for " + weekDay + ": ");
                double temperature = scanner.nextDouble();
                days.add(weekDay); // Add the day to the days ArrayList
                temperatures.add(temperature); // Add the temperature to the temperatures ArrayList
            }
            
            // Ask the user for input to either display individual day data or the entire week data
            scanner.nextLine(); 
            System.out.print("\nEnter a day of the week to display the temperature (or type 'week' for weekly average): ");
            String input = scanner.nextLine().trim();
            
            if (input.equalsIgnoreCase("week")) {
                // If the user entered "week", display the temperature for each day and the weekly average
                double totalTemperature = 0;
                System.out.println("\nTemperature for each day of the week:");
                for (int i = 0; i < days.size(); i++) {
                    System.out.println(days.get(i) + ": " + temperatures.get(i) + "°C");
                    totalTemperature += temperatures.get(i);
                }
                double weeklyAverage = totalTemperature / temperatures.size();
                System.out.println("\nWeekly average temperature: " + weeklyAverage + "°C");
            } else {
                // Otherwise, display the temperature for the specified day
                boolean found = false;
                for (int i = 0; i < days.size(); i++) {
                    if (days.get(i).equalsIgnoreCase(input)) {
                        System.out.println("The temperature for " + days.get(i) + " is: " + temperatures.get(i) + "°C");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Invalid day entered. Please enter a valid day of the week (Monday to Sunday).");

                    scanner.close();
                }
            }
        }
    }
}
      
