public class LargestArray{

    public static void main(String[] args){

int[] array = {2,3,2,4,4,2,2,4};



int count = 0;

int largest = 0;

for(int i = 0; i<array.length;i++){

if(array[i] >= largest){
    largest = array[i];
}
}
System.out.println(largest);
}

} 


