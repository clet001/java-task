import java.util.Scanner;

public class Kata{

    public static void main(String[] args) {

Scanner InputCollector = new Scanner (System.in);
System.out.println("Enter first number:");
int numberOne = InputCollector.nextInt();

System.out.println("Enter second number:");
int numberTwo = InputCollector.nextInt();

maximum = (numberOne, numberTwo);
 
}


public static int maximum(int numberOne, int numberTwo){

int max = 0;

if (numberOne > numberTwo) {
max = numberOne;
}
else {
max = numberTwo;
}
return max;
}
}
