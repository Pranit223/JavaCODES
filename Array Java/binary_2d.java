import java.util.Arrays;

public class binary_2d {
    public static void main(String[] args) {
        int matrix[][]={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int tar=29;
        System.out.println(Arrays.toString(search(matrix,tar)));
    }
    static int [] search(int [][]arr,int target){
        int r=0;
        int c=arr.length-1;
        while(r<arr[r].length && c>=0){
            if (arr[r][c]==target){
                return new int[]{r,c};
            }
            else if(arr[r][c]>target){
                c=c-1;
            }
            else{
                r=r+1;
            }
        }
        return new int[]{-1,-1};
    }
    }

