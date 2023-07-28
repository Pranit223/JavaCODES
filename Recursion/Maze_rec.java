public class Maze_rec {
    public static void main(String[] args) {
        maze("",3,3);
    }
    static void maze(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;


        }

        else {
            if (r > 1) {
                maze(p + 'D', r - 1, c);
            }
            if (c > 1) {
                maze(p + 'R', r, c - 1);
            }
        }
    }
}
