import java.util.Arrays;

public class NQueens {
    public static void main(String[] args) {
    boolean arr[][]= new boolean[4][4];
    nqueen(arr,0);
    }
    static void nqueen(boolean arr[][],int r){
        if(r>3){
            printarr(arr);
            System.out.println();
            return;
        }
        for (int c = 0; c <4 ; c++) {
            if(issafe(arr,r,c)){
                arr[r][c]=true;
                nqueen(arr,r+1);
                arr[r][c]=false;
            }
        }


    }
    static void printarr(boolean [][]arr){
        for(int i=0;i<4;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    static boolean issafe(boolean arr[][],int r,int c){
        for (int i = 0; i <r; i++) {
            if(arr[i][c]==true){
                return false;
            }
        }
        int maxleft=Math.min(r,c);
        for (int i = 1; i <=maxleft ; i++) {
            if(arr[r-i][c-i]==true){
                return false;
            }

        }
        int maxright=Math.min(r,4-c-1);
        for (int i = 1; i <=maxright ; i++) {
            if(arr[r-i][c+i]==true){
                return false;
            }
        }
        return true;
    }
}
