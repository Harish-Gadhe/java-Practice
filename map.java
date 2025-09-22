
import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        HashMap<String , int> students = new HashMap<>();
        students.put("harish" , 50);
        students.put("Sanket" , 90);
        students.put("Sandip" , 67);
        students.put("Sachin" , 65);

        System.out.print(students);
        System.out.print(students.get("harish"));
    }
}
