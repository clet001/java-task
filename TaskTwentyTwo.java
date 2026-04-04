import java.util.Scanner;
public class TaskTwentyTwo{
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Distance?");
        int distance = inputCollector.nextInt();

        System.out.println("Diameter?");
        int diameter = inputCollector.nextInt();

    

       double area = (distance / diameter);
        
       
         

            System.out.printf("%s %d ", "The area of the circle is", area);







    }
 }
