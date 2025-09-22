 import java.util.Arrays;
import java.util.Collections;

public class arrSort2{
    public static void main(String[] args) {
     Integer[] arr = { 3 , 8 , 2 , 1 , -2};

        Arrays.sort(arr , 0 , 3 , Collections.reverseOrder());

        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
