import java.util.Scanner;

class UniquePair {
public static void funPair(int[] arr) {
     
    for(int i= 0 ; i < arr.length - 1; i++) {
       for(int j = i+1 ; j < arr.length ; j++) {
            if(arr[i] == arr[j]) {
                continue; 
            }
            else{
            System.out.print( " ("  + arr[i] + " ," + arr[j] +  " )");
            }
       }
    }
} 


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =  new int[n];

        for(int i = 0 ; i < arr.length ; i++) {
         arr[i] = sc.nextInt();
        } 

        funPair(arr);

    
} 
}