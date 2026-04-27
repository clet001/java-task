import java.util.Scanner;

public class PatternX{

    public static void main(String[] args) {

Scanner InputCollector = new Scanner (System.in);
System.out.println("Enter number:");
int numberofrows= InputCollector.nextInt();


for(int rowCount=0;rowCount <= numberofrows;rowCount++){

    for(int starCount=4; starCount<=rowCount; starCount++){
    System.out.print("*");
}
    
   System.out.println();
}
    

 











    }

}

