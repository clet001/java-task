public class Task6{

    public static void main(){

        double result = divideBy(100, 0);
         System.out.println(result);
    }
       
    

    public static int squareOf(int number){
        return number * number;
    }


    public static double divideBy(double firstNumber, double secondNumber){
        if(firstNumber == 0 || secondNumber == 0){
            return 0;
        }
        return firstNumber/ secondNumber;
    }
 


}
