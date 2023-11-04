public class RemoveCharacter {
    public static void main(String[] args) {
        skip("", "baccadah");

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
}
