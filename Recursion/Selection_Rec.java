import java.util.Arrays;

public class Selection_Rec {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        int last =arr.length-1;
        selection(arr,0,last,-1);
        System.out.println(Arrays.toString(arr));
    }

    static int index;
    static void selection(int []arr,int j,int last,int max){
        if(last==0){
            return;
        }
        if(j<=last) {
            if (arr[j] > max) {
                max = arr[j];
                index = j;

            }
            selection(arr, j + 1, last,max);
        }
        else {
            int temp = arr[last];
            arr[last] = max;
            arr[index] = temp;
            selection(arr, 0, last - 1, -1);
        }
    }
}
