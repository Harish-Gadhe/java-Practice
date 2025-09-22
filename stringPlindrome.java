public class stringPlindrome {
    public static void main(String args[]) {
        String s = "madam";
         boolean isBoolean = false;
           
        for(int i = 0 ; i < s.length() - 1 ; i++) {

          int left = 0;
          int right = s.length() - 1;

          if(s.charAt(left) == s.charAt(right)) { 
            isBoolean = true;
            System.out.print(isBoolean);
          }
          else {
            isBoolean = false;
            System.out.print(isBoolean);
          }
          left++;
          right++;
        }
        
    }
}
