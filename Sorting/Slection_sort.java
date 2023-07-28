import java.util.Arrays;

public class Slection_sort {
    public static void main(String[] args) {
        int[]arr={3,2,1,5,4};
        int i,temp;
        for(i=0;i<arr.length;i=i+1){
            int start=0;
            int last=arr.length-i-1;
            int a=findmax(arr,start,last);

            temp=arr[last];
            arr[last]=arr[a];
            arr[a]=temp;


        }
        System.out.println(Arrays.toString(arr));
    }

    static int findmax(int[] arr, int start, int last) {
        int max=start;
        int k;
        for(k=0;k<=last;k=k+1){
            if(arr[max]<arr[k]){
                max=k;
            }
        }
        return max;
    }
}
