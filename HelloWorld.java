import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String name=scanner.nextLine();
        System.out.println("What is their job?");
        String job=scanner.nextLine();
        
        System.out.println("Here is the story!");
        System.out.println("once upon atime there was" + name + ", who was " + job + ".");
        System.out.println("One the way to work" + name + "reflected on life");
        System.out.println("Perhaps " + name + " will not be " + job + " forever.");
        
        

    }
}