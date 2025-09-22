import java.util.Scanner;
public class Array3 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] numbers= new int[size];

        for (int i = 0 ; i < size ; i++) {
            numbers[i]= sc.nextInt();
        }
        int max = 0;

        for(int i = 0 ; i < numbers.length ; i++) {
            if( numbers[i] > max) {
            max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
