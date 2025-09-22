public class maxValue {
    public static int maxElement(int arr[] , int n) {

        if(n == 1) {
            return arr[0];
        }
        
        int maxInt = Math.max(maxElement(arr , n - 1 )  , arr[n - 1]);

        return maxInt;
    }

    public static void main(String args[]) {
    int arr[] = {1 , 12 , 13 , 40 , 14 , 15};
    
    System.out.println(maxElement(arr , arr.length));
    }
}
