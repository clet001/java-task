import java.util.Scanner;

public class AddThreeDigits {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
        
        
      System.out.print("Enter the digit: ");
        int digits1 = input.nextInt();
        
   System.out.print("Enter digit: ");
        int digits2 = input.nextInt();
        
        System.out.print("Enter the digit: ");
        int digits3 = input.nextInt();
        
        
    int sum = digits1 + digits2 + digits3;
        
       
        System.out.println("The sum of the digits is " + sum);
    }
}
