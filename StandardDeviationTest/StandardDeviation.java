public class StandardDeviation{

    public static double add(int[] array) {      
    
        int sum = 0;     
    
        for (int count = 0; count < array.length; count++) {              
        sum += array[count];  
    }        
        return sum;
}

 

public static double mean(int[] array) {      
    
    double sum = 0; 
    double mean = 0;    

    for (int count = 0; count < array.length; count++) {              
        sum += array[count];  
    } 

    mean = sum / array.length; 
    


   return mean; 



}

public static double meanDeviation(int[] array){
double length = array.length;
double deviationMean = length-mean(array);

return deviationMean;


}

public static double variance(int[] array){



}
