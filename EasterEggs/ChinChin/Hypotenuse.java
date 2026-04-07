import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("length of first leg ");
        double leg1 = input.nextDouble();
        
      System.out.print("length of second leg ");
        double leg2 = input.nextDouble();
        
        
double squared1 = leg1 * leg1;

double squared2 = leg2 * leg2; 

double hypotenuse = squared1 + squared2; 

       
        
       
        System.out.println("The hypotenuse is " + hypotenuse);
    }
}
