public class Secondlargest{

    public static void main(String[] args){

int[] array = {2,3,2,4,4,2,2,4};



int secondlargest = array[0];

int largest = array[0];

for(int i = 0; i<array.length;i++){

if(array[i] >= largest){
    largest = array[i];
    }
}

for(int i = 0; i<array.length;i++){

if(array[i]<largest && array[i]> secondlargest)
   
    secondlargest = array[i];
 }
System.out.println(secondlargest);
}

} 


