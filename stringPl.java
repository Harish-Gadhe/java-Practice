public class stringPl {
    public static boolean isPali(String s , int left , int right) {
     
        if(left >= right) { return true; }

        if(s.charAt(left) != s.charAt(right))  { return false; }

        return isPali(s , left + 1 , right - 1 );
    }
    public static void main(String[] args) {
        String s = "madam";

       System.out.println( isPali(s , 0 , s.length() - 1) );
    }
}
