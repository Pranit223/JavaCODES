import java.util.Arrays;

//Maze All side using Backtracking!!
//Also 2nd function is to print the path.
public class MazeAllside {

    public static void main(String[] args) {
        Boolean arr[][]={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int path[][]={
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        maze(arr,"",0,0);
    }
    static void maze(Boolean [][]arr,String p,int r,int c){

        if(r==2 && c==2){
            System.out.println(p);
            return;

        }
        if(arr[r][c]==false){
            return;
        }
        arr[r][c]=false;
            if (r < 2) {

                maze(arr,p + 'D', r + 1, c);
            }
            if (c < 2) {
                maze(arr,p + 'R', r, c + 1);
            }
            if(r>0){
                maze(arr,p+'U',r-1,c);
            }
            if(c>0){
                maze(arr,p+'L',r,c-1);
            }
            arr[r][c]=true;


    }
    static void mazeprint(Boolean [][]arr,String p,int r,int c,int [][]path,int step){

        if(r==2 && c==2){
            path[r][c]=step;
            for(int i=0;i<3;i++) {
                System.out.println(Arrays.toString(path[i]));

            }
            System.out.println(p);
            return;

        }
        if(arr[r][c]==false){
            return;
        }
        path[r][c]=step;
        arr[r][c]=false;
        if (r < 2) {

            mazeprint(arr,p + 'D', r + 1, c,path,step+1);
        }
        if (c < 2) {
            mazeprint(arr,p + 'R', r, c + 1,path,step+1);
        }
        if(r>0){
            mazeprint(arr,p+'U',r-1,c,path,step+1);
        }
        if(c>0){
            mazeprint(arr,p+'L',r,c-1,path,step+1);
        }
        arr[r][c]=true;
        path[r][c]=0;


    }
}
