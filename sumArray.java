import java.util.Scanner;
public class sumArray {
    public static void main(String[] args) {
        
        int[] arr = {10 , 20 ,30 , 40 , 50 , 60 , 70 , 80 , 90 , 100};
        int total = 0;

        for(int i = 0; i < arr.length ; i++) {
            total = total + arr[i];
            
        }
        System.out.print(total);
    }
}
