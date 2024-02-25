import java.util.Scanner;
public class CtoF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperatureFahrenheit;
        boolean done = false;

        do {
            // Prompt user for input
            System.out.print("Enter temperature in Fahrenheit (or type 'done' to exit): ");

            if (scanner.hasNextDouble()) {
                // If input is a valid double, proceed with temperature conversion
                temperatureFahrenheit = scanner.nextDouble();

                double temperatureCelsius = convertFahrenheitToCelsius(temperatureFahrenheit);
                System.out.println("Temperature in Celsius: " + temperatureCelsius);

            } else {
                // If input is not a valid double, check if user wants to exit
                String input = scanner.next();

                if (input.equalsIgnoreCase("done")) {
                    // User wants to exit
                    done = true;
                } else {
                    // Invalid input, display error message and clear input buffer
                    System.out.println("Invalid input. Please enter a valid number or 'done' to exit.");
                    scanner.nextLine(); // Clear the input buffer
                }
            }

        } while (!done);
    }

    // Method to convert Fahrenheit to Celsius
     private static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
