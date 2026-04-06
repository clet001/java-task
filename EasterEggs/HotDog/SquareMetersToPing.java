import java.util.Scanner;
public class SquareMetersToPing{
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Your number in Square Meters?");
        double input = inputCollector.nextDouble();

        

    

       double squareMeters = input;
        

       double ping = squareMeters * 0.30;
        
        
         

            System.out.print(squareMeters +  " squareMeters is" + ping  +  "ping");


//Write a program that converts square meters into ping. The program prompts the user to enter a number in square meters, converts it to ping, and displays the result. (Note: 1 square meter is 0.3025 ping.)
