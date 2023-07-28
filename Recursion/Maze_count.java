public class Maze_count {
    public static void main(String[] args) {
     int ans=maze_count(3,3);
        System.out.println(ans);
    }


    static int maze_count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=maze_count(r-1,c);
        int right=maze_count(r,c-1);
        return left +right;
    }
}
