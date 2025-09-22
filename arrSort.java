public import java.util.Arrays;
import java.util.Collections;

public class arrSort2{
    public static void main(String[] args) {
        Integer[] arr = { 10 , 20 , 1, 2 ,3};

        Arrays.sort(arr , Collections.reverseOrder());

        for(int i = 0 ; i < arr.length - 2 ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
} {
    
}
