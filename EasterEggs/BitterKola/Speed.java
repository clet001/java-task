import java.util.Scanner;

    public class Speed {

    public static void main(String[] args){
    Scanner inputCollector = new Scanner (System.in);

    System.out.println("What is the speed?");
        int speed = inputCollector.nextInt();






   if (Speed == 0){
        System.out.println("Stationary");
    }     

    else{ 
    if (speed >= 1 && speed <= 40){
    System.out.println("Slow");
    }

        if (Speed >= 80){
        System.out.println("Moderate");
    }     

    else{ 
    if (speed <= 120){
    System.out.println("Dangerously Fast");
    }

}
}




    }



}
