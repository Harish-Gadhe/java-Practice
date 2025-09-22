public class Array5 {
     
    public static void printarr(int[] n) {
        for(int i = 0 ; i < n.length ; i++)
        System.out.print(n[i] + " ");
    }

    public static void main(String args[]) {
       int[] arr = {8,9,2,3,1};

       for(int i = 0 ; i < arr.length - 1 ; i++) {
          for(int j = 1 ; j < arr.length - i - 1 ; j++) {
            if(arr[j] > arr[j + 1]) {
               int temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;

            }
          }
        
       }
       printarr(arr);
    }
}
