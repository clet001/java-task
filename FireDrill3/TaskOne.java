import java.util.Arrays;
import java.util.Scanner;
public class TaskOne{
    public static void main(String[] args){
Scanner inputCollector = new Scanner (System.in);



int[] scores = new int[10];
for(int count=0;count<10;count++){
System.out.println("Enter Score: ");

scores[count]= inputCollector.nextInt();


}

 System.out.println(Arrays.toString(scores));

}

}


