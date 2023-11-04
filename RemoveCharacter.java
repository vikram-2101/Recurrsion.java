
public class RemoveCharacter {
    public static void main(String[] args) {
      //  skip("", "baccadah");
      //System.out.println(skip("baccadah"));
     System.out.println(skipAppNotApple("bacappledah"));
    }

    static void skip(String processed, String Unprocessed) {
        if (Unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = Unprocessed.charAt(0);
        if (ch == 'a') {
            skip(processed, Unprocessed.substring(1));

        } else {
            skip(processed + ch, Unprocessed.substring(1));
        }
    }
    // inPlace
     static String skip(String unprocessed) {
        if(unprocessed.isEmpty()) return "";

        char ch = unprocessed.charAt(0);
        if(ch == 'a') {
            return skip(unprocessed.substring(1));

        }
        else {
            return ch + skip(unprocessed.substring(1));
        }
     }
     static String skipAppNotApple(String unprocessed) {
          if(unprocessed.isEmpty()) return "";

          if(unprocessed.startsWith("app")  && !unprocessed.startsWith("apple")) {
            return skipAppNotApple(unprocessed.substring(5));
          }
          else {
            return unprocessed.charAt(0)+skipAppNotApple(unprocessed.substring(1));
          }
     }
     

}
