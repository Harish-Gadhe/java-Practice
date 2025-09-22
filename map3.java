import java.util.TreeMap;
import java.util.Map;

public class map3 {
    public static void main(String[] args) {
        Map<Integer , Integer> students = new TreeMap<Integer , Integer>();
        students.put(7 , 3);
        students.put(4 , 8);
        students.put(11 , 13);
        students.put(0 , 20);

        System.out.print(students);
    
        
    }
}