import java.util.Scanner;

public class Hi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Convert String to double
        String val = "42.42";
        double d = Double.valueOf(val);

        System.out.println("String: " + val);
        System.out.println("Double: " + d);

        // Convert String input to int
        System.out.print("\nEnter an integer: ");
        int value = Integer.valueOf(scanner.nextLine());

        System.out.println("You wrote: " + value);

        // Convert String input to double
        System.out.print("\nEnter a decimal number: ");
        double val2 = Double.valueOf(scanner.nextLine());

        System.out.println("You wrote: " + val2);

        // Read integer directly
        System.out.print("\nEnter another integer: ");
        int num = scanner.nextInt();

        System.out.println("Integer value: " + num);

        // Automatic conversion from int to double
        double convertedNumber = num;

        System.out.println("Converted to double: " + convertedNumber);

        scanner.close();
    }
}