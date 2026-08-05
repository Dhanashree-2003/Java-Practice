import java.util.Scanner;
public class Scan {
       public static void main(String[] args){
         int f=2;
         int s=4;

        System.out.println(f);
        System.out.println(s);
        int sum=f+s;
        System.out.println(sum);

        int calculationWithParentheses=(1+1)+3*(2+5);
        System.out.println(calculationWithParentheses);
        int calcualtionWithoutParentheses=1+1+3*2+5;
        System.out.println(calcualtionWithoutParentheses);

        int cal=(1+1);
        System.out.println(cal);
        cal=cal+3*(2+5);
        System.out.println(cal);
        int cal2=1+1;
        cal2=cal2+3*2;
        cal2=cal2+5;
        System.out.println(cal2);

        Scanner scanner=new Scanner(System.in);
        System.out.println("how many days would yo like to convert in seconds?");
        int days=Integer.valueOf(scanner.nextLine());
        int seconds=days *24*60*60;
        System.out.println(seconds);

        int a=1;
        int b=1;
        System.out.println(a+b);
        System.out.println(2+a-b-a);

        int length=42;
        System.out.println(length);
        System.out.println("here is an integer --->" +2);
        System.out.println(2 + " is an integer");

        System.out.println("Four: " + (2 + 2));
        System.out.println("But! Twenty-two: " + 2 + 2);

        System.out.println("Give first number:");
        int first=Integer.valueOf(scanner.nextLine());
        System.out.println("Give second number:");
        int second=Integer.valueOf(scanner.nextLine());
        System.out.println("Give third number:");
        int third=Integer.valueOf(scanner.nextLine());
        System.out.println("the sum of the numbers is " +(first+second+third));
        
        int x=10;
        System.out.println("y= " +x);
        int y=5;
        int z=6;
        System.out.println("y= "+y+" z= "+z);

        System.out.println("give first number:");
        int firstnumber=Integer.valueOf(scanner.nextLine());
        int secondnumber=Integer.valueOf(scanner.nextLine());
        System.out.println(firstnumber*secondnumber);
        scanner.close();
    }

    
}
