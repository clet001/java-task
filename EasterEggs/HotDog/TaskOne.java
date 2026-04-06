import java.util.Scanner;
public class MileToKilometer{
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Your number in Miles?");
        double input = inputCollector.nextDouble();

        

    

       double miles = input;
        //double kilometers = 0.0;

       double kilometers = miles * 1.6;
        
        
         

            System.out.print(miles +  " miles is" + kilometers  +  "kilometers");







    }
 }
