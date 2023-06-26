import java.util.Scanner;

public class Adition{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter first integer ");
        int number1 = scan.nextInt();
        
        System.out.print("Enter second integer ");
        int number2 = scan.nextInt();         
        
        int sum = number1 + number2;
        System.out.printf("Sum is %d%n", sum);

        scan.close();
    }
}
