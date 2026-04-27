import java.util.Scanner;

public class Switch{
    public static void main(String[] args){

Scanner inputCollector = new Scanner (System.in);
    System.out.println("Enter a number");
        int number = inputCollector.nextInt();


switch (number % 2){
    case 0:
    System.out.println("even");
    break;
    
    case 1:
    System.out.println("Odd");
    break;
    
    default:
    System.out.println("Something went wrong");
    


}

     }


}
