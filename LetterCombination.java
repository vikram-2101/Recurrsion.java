import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {
         // phonepad("", "12");
        System.out.println(padcount("", "23"));
         //System.out.println(pad("", "34"));
    }

    static void phonepad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; // This will convet '2' into 2

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            phonepad(p + ch, up.substring(1));

        }
    }

    static ArrayList<String> pad(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
              
        int digit =  up.charAt(0) - '0';  

       ArrayList<String> list = new ArrayList<String>();
       for(int i = (digit - 1) * 3; i < digit * 3; i++) {
        char ch = (char) ('a' + i);
        list.addAll(pad(p+ch , up.substring(1)));
       }
       return list;
    }

     static int padcount(String p , String up)  {
        if(up.isEmpty())  {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0)- '0';
        for(int i =  (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + padcount(p+ch, up.substring(1));
        }
        return count;
     }

}
