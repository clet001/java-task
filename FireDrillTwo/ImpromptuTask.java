import java.util.Scanner;

public class ImpromptuTask{
    public static void main(String[] args){

Scanner InputCollector = new Scanner (System.in);
System.out.print("Enter integer:");
int input = InputCollector.nextInt();
int total=0;




while (input >0){
total+= input % 10;

  input/=10;






}

    System.out.printf("The sum is %d", total);
}








}
