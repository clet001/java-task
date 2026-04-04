import java.util.Scanner;
public class Thirty{
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Integer?");
        int age1 = inputCollector.nextInt();

        System.out.println("Integer?");
        int age2 = inputCollector.nextInt();

    

        int addition = (age1 + age2);
        
        int product = (age1 * age2);
         

            System.out.printf("%s %d %s %d", "The sum is", addition, "while the product is", product);







    }
 }
