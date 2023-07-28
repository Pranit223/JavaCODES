import java.util.Arrays;

public class binary_sorted2d {
    public static void main(String[] args) {
        int r, c;
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}

        };
        for (r = 0; r < 4; r = r + 1) {
            for(c=0;c<4;c=c+1){
                System.out.println(matrix[r][c]);
            }

            System.out.println(Arrays.toString(matrix[r]));
        }


    }
}
//    static int [] search(int []arr,int target,int s,int e){
//        int start=0;
//        int end=arr.length-1;
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(target>arr[mid]){
//                start=mid+1;
//            }
//            else if(target<arr[mid]){
//                end=mid-1;
//            }
//            else{
//                return new int []{mid,mid};
//            }
//        }
//        return new int[]{-1,-1};



