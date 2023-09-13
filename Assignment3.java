import java.util.Scanner;
public class Assignment3{

    //METHODS

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

int [] reverse(int [] array){
int [] reverse = new int[array.length];
int size = array.length;
for(int i = 0; i < array.length; i ++){
  
    reverse[size - 1] = array[i];
    size = size - 1;

}
return reverse;
}


//MAIN

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
    int [] reverse = assignment3.reverse(array);
    System.out.print("Reverse array ");
    for(int i = 0; i < array.length; i ++){
        System.out.print(reverse[i] + " ");
    }
    System.out.println();
    }
}