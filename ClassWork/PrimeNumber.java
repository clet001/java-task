import java.util.Scanner;

public class PrimeNumber{

    public static void main(String[] args){
        
        Scanner inputCollector = new Scanner (System.in);

        System.out.println ("Enter Number");
        
        int number = inputCollector. nextInt();

int sum = 0;



        for(int count=2; count <= number; count++){
     if(number % count == 0){

    number = number / count;

    sum = sum + count;    

}

else{

count++;
}
}
System.out.printf("sum is %d%n", sum);
}
}
        


        




  
