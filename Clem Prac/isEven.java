public class isEven{

    public static boolean isEven(int number){

        if(number % 2 == 0){
            return true;
        
        }

            return false;
    }

    public static void main(String[] args){

    boolean result = isEven(12); 
   System.out.println("result is" +  result );

    }

}
