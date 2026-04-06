import java.util.Scanner;
public class TaskForteen{
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Integer?");
        int age1 = inputCollector.nextInt();

        System.out.println("Integer?");
        int age2 = inputCollector.nextInt();

        System.out.println("Integer?");
        int age3 = inputCollector.nextInt();

        int average = (age1 + age2 + age3) / 3;
         

            System.out.printf("%s %d", "The averge for the 3 ages are", average);







    }
 }
