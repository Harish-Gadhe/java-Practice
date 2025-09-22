import java.util.Scanner;
public class removeDuplicateArr {
    public static int removeDuplicate(int arr[]) {
        
        int ans = 0;

        for(int i = 0; i < arr.length ; i++) {
            if(arr[ans] != arr[i]) {
                ans++;
                arr[ans] = arr[i];
            }
        }
        return ans + 1;
    }

    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int[] arr = new int[n];

      for(int i = 0 ; i < n ; i++) {
        arr[i] = sc.nextInt();
      }
       int newarr =  removeDuplicate(arr);

       for(int i = 0; i < newarr; i++){
        System.out.print(arr[i]);
       }
    }
}
