public class arr2 {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3};
        int n = arr.length;
        int new_arr[]  =  new int[n-1];

        for(int i = 0 ; i < n - 1; i++) {
        new_arr[i] = arr[i + 1];
        }
        for(int i = 0; i < new_arr.length ; i++) {
            System.out.print(new_arr[i]);
        }
      }
}
