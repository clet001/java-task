import java.util.Scanner;
public class NumbLoop2{
public static void main(String[] args){

Scanner inputCollector = new Scanner (System.in);

System.out.println("Enter numer:");
int number = inputCollector. nextInt();

int i;
int j;

    for(i=1; i<=number; i++){

        for(j=1; j<=number; j++){

        System.out.print("*");

        }

     System.out.println();
    }

}

}
