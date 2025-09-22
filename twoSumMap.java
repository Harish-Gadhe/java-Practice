import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class twoSumMap {

    public static int[] sum(int[] arr , int target) {
    Map<Integer , Integer> sumEle = new HashMap<>();

    for(int i = 0 ; i < arr.length ; i++) {
      int validElem = target - arr[i];

      if(sumEle.containsKey(validElem)) {
       return new int[] { sumEle.get(validElem), i};

      }
      sumEle.put(arr[i] , i);

    }
    return new int[] {};
    }

    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int  a = sc.nextInt();
    int[] arr = new int[a];

    for(int i = 0; i < a ; i++) {
    arr[i] = sc.nextInt(); }

    int[] ans = sum(arr , 10);
    
    if(ans.length == 2){
        System.out.print(ans[0] + " " + ans[1]);
    }
      else System.out.print("no ans found");
      
    
    }
}