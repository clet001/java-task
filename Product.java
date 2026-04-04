import java.util.Scanner;
public class TaskFive{
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter first integer:");
        int numb1 = inputCollector.nextInt();

        System.out.print("Enter second integer:");
        int numb2 = inputCollector.nextInt();

        int product = numb1 * numb2;


         

            System.out.printf("%s %d %n", "The Product is", product);
        }        

}
