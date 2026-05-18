public class MiniArray{

    public static void main(String[] args){

int[] array = {2,3,2,4,4,2,2,4};



int count = 0;

int minimum = array[0];

for(int i = 0; i<array.length;i++){

if(array[i] <= minimum){
    minimum = array[i];
}
}
System.out.println(minimum);
}

} 


