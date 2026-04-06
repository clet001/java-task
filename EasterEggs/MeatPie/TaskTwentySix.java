import java.util.Scanner;
public class TaskTwentySix{
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = inputCollector.next();

        System.out.println("What is your age?");
        int age = inputCollector.nextInt();

         

            System.out.printf("%s %s %s %d %s", "Hello", name, "you are", age, "years old");







    }
 }
