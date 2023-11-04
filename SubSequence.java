public class SubSequence {
    public static void main(String[] args) {
        
    }
      static void subseq(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        subseq(processed+ch, unprocessed.substring(1));
        subseq(processed, unprocessed.substring(1));
      }

       
}
