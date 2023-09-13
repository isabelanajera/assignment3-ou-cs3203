import java.util.Scanner;
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
public static void main(String args[]){Assignment3 assignment3 = new Assignment3();
    Scanner keyboard = new Scanner(System.in);
    
     System.out.println("Enter size");
    int size = keyboard.nextInt();
    int [] array = new int[size];
    System.out.println("Enter numbers");
    for(int i = 0; i < size; i ++){
    array[i] = keyboard.nextInt();
    }
    
    int sum = assignment3.sum(array);
    System.out.println("Sum " + sum);
    int product = assignment3.product(array);
    System.out.println("Product " + product);
    
    }
}