public class Arrays {

    public int[] largestElement(int[] array) {

    int largest = array[0];

    for(int index = 0; index < array.length; index++) {
        
        if (array[index] > largest) { 
            largest = array[index]
        }
       
        return largest;
    }

}


    public int[] arraySum(int[] array) {

    int sum = 0;

    for(int index = 0; index < array.length; index++) {
        sum += array[index];
        }
       
        return sum;

    }


    public int[] reverseArray(int[] array) {

    int [] reverse = new int[array.length]

    int sum = 0;

    for(int index = array.length - 1; index >= 0; index--) {
          reverse = array[index];
        }
       
        return reverse;

}
