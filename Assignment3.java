
public class Assignment3{
int sum(int [] array){

   
    int sum = 0;
    for(int i = 0; i < array.length; i ++){
        sum+=array[i];
    }
    return sum;
}
int product(int [] array){

    int product = 0;
 
    for(int i = 0; i < array.length-1; i ++){
        product = array[i] * array[i+1];
        
    }
    return product;
}
public static void main(String args[]){}
}