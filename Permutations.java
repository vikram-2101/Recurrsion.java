import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
    //     ArrayList<String> result = permution("", "abc");
    // System.out.println(result); 
    
    System.out.println(PermutationCount("","abc")); 
  }
    static void Permutation(String p , String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0  ; i < p.length() ; i++) {
            String f = p.substring(0,i);
            String s =  p.substring(i, p.length() );
            Permutation(f + ch +s , up.substring(1));
        }
    }

     static ArrayList<String> permution(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
    char ch = up.charAt(0);

    // local to this call 
    ArrayList<String> result = new ArrayList<>();

             for(int i = 0; i <= p.length(); i++) {
                String f = p.substring(0,i);
                String s  = p.substring(i,p.length());
            result.addAll(permution(f + ch + s , up.substring(1)));
        }
        return result;
     }

      static int  PermutationCount(String p , String up) {
        if(up.isEmpty()) {
           
            return 1;
        }
          int count = 0;
        char ch = up.charAt(0);
      
        for(int i = 0  ; i <= p.length() ; i++) {
            String f = p.substring(0,i);
            String s =  p.substring(i, p.length() );
           count =  count + PermutationCount(f + ch +s , up.substring(1));
        }
        return count;
    }
}
