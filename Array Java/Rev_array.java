import java.util.Arrays;

public class Rev_array {
    public static void main(String[] args) {
        int []arr={1,3,5,6,7,8,2};
        int []nums=new int[arr.length-1];
        int i;
        int j=arr.length-1;
        for(i=0;i<=j;i=i+1){
            nums[i]=arr[i];
            arr[i]=arr[j];
            arr[j]=nums[i];
            j=j-1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
