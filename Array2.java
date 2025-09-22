import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();

       int[] number = new int[size]; 

       for(int i = 0 ; i < size ; i++) {
        number[i] = sc.nextInt();
       }
       
       int target = sc.nextInt();
 
       for(int i = 0 ; i <  number.length ; i++) {
        // System.out.println(number[i]);
        // int target = sc.nextInt();
        if(number[i] == target) {
            
            System.out.println("found target at index " + i); 
        }
        else {
            System.out.println("not found");
        }
       }
    }
}
