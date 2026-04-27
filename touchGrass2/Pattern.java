import java.util.Scanner;

public class Pattern{

    public static void main(String[] args) {

Scanner InputCollector = new Scanner (System.in);
System.out.println("Enter number:");
int numberofrows= InputCollector.nextInt();


for(int rowCount=1;rowCount <= numberofrows;rowCount++){

    for(int starCount=1; starCount<=rowCount; starCount++){
    System.out.print("*");
}
    
   System.out.println();
}
    

 











    }

}

