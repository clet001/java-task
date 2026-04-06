import java.util.Scanner;

    public class Bmi{
 
        public static void main (String[] args){

            Scanner inputCollector = new Scanner(System.in);
                
                System.out.println("Enter weight in pounds");
                double weight = inputCollector.nextLong();

                System.out.println("Enter height in pounds");
                double height = inputCollector.nextLong();


                
                double pound = 0.45 * weight;
                double inch = 0.0254 * height;
                

                 
    
    

    System.out.printf("%s %d%s %s %d%s", "Your weight is", "kg", "while your height is", "inc", pound, inch);








//Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI. (Note: 1 pound = 0.45359237 kilograms, 1 inch = 0.0254 meters.)









    }





}
