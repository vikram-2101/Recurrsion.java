
import java.util.*;

public class Maze {
    public static void main(String[] args) {

       System.out.println(path2("", 3, 3)); 
        // System.out.println(count(3, 3));
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1)
            return 1;

        int left = count(r - 1, c);
        int right = count(r, c - 1);

        return left + right;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + 'D', r - 1, c);
        }
        if (c > 1) {
            path(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> path2(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
         
        ArrayList<String> list = new ArrayList<String>();
         if (r > 1) {
        list.addAll(path2(p + 'D', r - 1, c));
        }
        if (c > 1) {
        list.addAll(path2(p + 'R', r, c - 1));
        }
        return list;
    }
}
