public class fabo {
//     public static int f(int n) {
//      if(n == 1) return 0;
//      if(n == 2) return 1;

//      return  f(n - 1) + f(n - 2);
// }    
    public static void main(String args[]) {
 
        int first_term = 0;
        int second_term = 1;

        for(int i = 0 ; i < 5 ; i++) {
           int next_term = first_term + second_term;
           first_term = second_term;
           second_term = next_term;
           System.out.print(first_term);
 }
    
        
    }
}