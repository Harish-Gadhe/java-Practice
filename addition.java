import java.util.Scanner;
public class addition {
    public static int addArr(int[] arr , int n) {
        if(arr.length == 0)  {
            return 0;
         }
        
        return arr[n - 1] + addArr(arr, n - 1) ;
        
    }

    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i = 0 ; i < n ; i++) {
        arr[i] = sc.nextInt();
    }

    int sum = addArr(arr , arr.length);
    System.out.print(sum);
    }
}