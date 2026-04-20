import java.util.Scanner;

    public class Factors{
        public static void main(String[] args){



Scanner input = new Scanner(System.in);
System.out.println("Enter an Integer");
int number = input.nextInt();


for (int factor =1; factor >= number; factor++){

//System.out.println("Enter an Integer");
//int number = input.nextInt();

if (number % factor == 0){
    System.out.print(factor + " ");



}



}



        }






}
