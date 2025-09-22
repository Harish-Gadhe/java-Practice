import java.util.Scanner;
class twoSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 20 , 30 , 50 , 50, 70};

        int find = sc.nextInt();

        for(int i = 0; i < arr.length - 1 ; i++) {
            for(int j = i  ; j < arr.length ; j++) {
                if( find == arr[i] + arr[j]) {
                    System.out.println( "Target aquaired at  index : " + i +  " " + j);
                }
                else {
                    System.out.println(" pair not found ");
                }
            }
        }
    }
}