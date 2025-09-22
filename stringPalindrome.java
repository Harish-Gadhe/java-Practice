public class stringPalindrome {
    public static boolean checkPalindrome(String s , int left , int right ) {
    
        // if(s.length() == 0 || s.length() == 1) return true;

        // if(s.charAt(0) != s.charAt(s.length() - 1))  return false;

        // return checkPalindrome(s.substring(1, s.length() - 1 ));

        

        if( left >= right) return true;

        if(s.charAt(left) != s.charAt(right)) return false;

        return checkPalindrome(s , left + 1 , right - 1);


    }
    public static void main(String[] args) {
    String st = "harish";
    System.out.print(checkPalindrome(st , 0 , st.length() - 1));
    }
}
