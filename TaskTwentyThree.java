import java.util.Scanner;
public class TaskTwentyThree{
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("What is your Surname?");
        String surname = inputCollector.next();

        System.out.println("What is your Firstname?");
        String firstName = inputCollector.next();

        System.out.print(surname + firstName);
         

            System.out.printf("%s%s%n", surname, firstName);







    }
 }
