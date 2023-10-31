public class Nto1 {
    public static void main(String[] args) {
        fun(10);
    }
    static void fun(int n ) {
        if(n==0) {
            return;
        }
         fun(n-1);
        System.out.println(n);
        // for  reverse just write fun below the print statement
       
    }
}
