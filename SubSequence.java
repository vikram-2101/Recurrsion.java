import java.util.*;
public class SubSequence {
    public static void main(String[] args) {
//subseq("", "abc");
      System.out.println(subseqRet("", "abc"));
    }

    static void subseq(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        subseq(processed + ch, unprocessed.substring(1));
        subseq(processed, unprocessed.substring(1));
    }
      static ArrayList<String> subseqRet(String processed, String unprocessed) {
         if(unprocessed.isEmpty()) {
            ArrayList<String> result = new ArrayList<>();
            result.add(processed);
            return result;
         }
         char ch = unprocessed.charAt(0);
         ArrayList<String> left = subseqRet(processed+ch, unprocessed.substring(1));
         ArrayList<String> right = subseqRet(processed, unprocessed.substring( 1));
          left.addAll(right);
          return left;
      }
}
