
public class AllPath {
    public static void main(String[] args) {
        boolean[][] board = {
                { true, true, true },d
                { true, true, true },
                { true, true, true },
        };
        allpath("", board, 0, 0);

    }
        static void allpath(String p , boolean[][] maze , int r , int c) {
            if ( r==maze.length -1  &&  c==maze[0].length -1) {
                System.out.println(p);
                return;
            }

             if (!maze[r][c]) return ;

             maze[r][c] = false;

             if ( r < maze.length - 1) {
                allpath(p + 'D', maze, r+ 1, c);
             }

             if ( c < maze[0].length - 1) {
                allpath(p +'R', maze, r, c+1);
             }
              
             if ( r>0) {
                allpath(p + 'U', maze, r - 1, c);
             }

             if ( c > 0) {
                allpath(p + 'L' , maze, r, c-1);
             }

             // This line is where the function will be over
             // so before the function gets removed , also remove the changes that were made

             maze[r][c] = true;
        }
}
