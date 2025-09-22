import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        HashMap<Integer , Integer> students = new HashMap<>();
        students.put(7 , 3);
        students.put(4 , 8);
        students.put(11 , 13);
        students.put(4 , 20);

        System.out.print(students);
        
    }
}