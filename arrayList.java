import java.util.List;
import java.util.ArrayList;
// import java.util.Collections;

public class arrayList {
      public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);

        nums.add(20);
        System.out.println(nums.size());

        System.out.println(nums);
      }
}