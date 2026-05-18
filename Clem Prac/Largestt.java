public class Largestt{

    public static int isLargest(int a, int b, int c){

        int largest = a;

        if(b > largest){
            largest = b;
    
        } 
        if(c > largest){
            largest = c;
        }
        
    return largest;    

    }


    public static void main (String[] args){

    int result = isLargest(5,6,8);

    System.out.println ("Largest is " + result);
}

}


