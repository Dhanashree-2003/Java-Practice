/*import java.util.Scanner;

public class U {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        double squareRoot = Math.sqrt(sum);
        System.out.println(squareRoot);

        sc.close();
    }
}
*/

/*public static void main(String[] args) {
    int number = 12;

    if (number > 10) {
        System.out.print("Hello ");
    } else if (number < 20) {
        System.out.print("world");
    } else {
        System.out.print("!");
    }
}*/

/*import java.util.Scanner;

public class U {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println(number * -1);
        } else {
            System.out.println(number);
        }

        scanner.close();
    }
}*/

import java.util.Scanner;

public class U {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        if (first > second) {
            System.out.println(first + " is greater than " + second + ".");
        } else if (first < second) {
            System.out.println(first + " is smaller than " + second + ".");
        } else {
            System.out.println(first + " is equal to " + second + ".");
        }
        scanner.close();
    }
}