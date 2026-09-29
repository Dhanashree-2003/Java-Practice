// This program checks if a given integer is positive or negative.
/*import java.util.Scanner;

public class Hii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

        scanner.close();
    }
}*/

/*public class Hi {
    public static void main(String[] args) {
        int number = 3;

        if (number == 1) {
            System.out.println("The number is one");
        } else if (number == 2) {
            System.out.println("The given number is two");
        } else if (number == 3) {
            System.out.println("The number must be three!");
        } else {
            System.out.println("Something else!");
        }

    }
}*/

//Write a program that prompts the user for two integers and prints the larger of the two. If the numbers are the same, then the program informs us about this as well.
/*import java.util.*;
public class Hi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give first number:");
        int nummber = scanner.nextInt();
        System.out.println("Give second number:");
        int number2 = scanner.nextInt();
        if (nummber > number2) {
            System.out.println("The first number is greater than the second number");
        } else if (nummber < number2) {
            System.out.println("The second number is greater than the first number");
        } else {
            System.out.println("Both numbers are equal");
        }
        scanner.close();
    }
}
    */

import java.util.Scanner;

public class GradesAndPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int points = Integer.valueOf(scanner.nextLine());

        if (points < 0) {
            System.out.println("Grade: impossible!");
        } else if (points <= 49) {
            System.out.println("Grade: failed");
        } else if (points <= 59) {
            System.out.println("Grade: 1");
        } else if (points <= 69) {
            System.out.println("Grade: 2");
        } else if (points <= 79) {
            System.out.println("Grade: 3");
        } else if (points <= 89) {
            System.out.println("Grade: 4");
        } else if (points <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }

        scanner.close();
    }
}
