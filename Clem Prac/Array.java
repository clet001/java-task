public class Array{

    public static void main(String[] args){

int[] array = {2,3,2,4,4,2,2,4};

int target = 2;

int count = 0;

for(int i = 0; i<array.length;i++){

if(array[i] == target){
    count++;
}
}
System.out.println(count);
}

} 


