import java.util.Arrays;

public class Bubble_Rec {
    public static void main(String[] args) {
     int []arr={5,4,3,2,1};
     int last=arr.length-1;
     bubble(arr,last,1);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int []arr,int last,int j){
        if(last==0){
            return;
        }
        if(j<=last){
            if(arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                bubble(arr,last,j+1);
        }
            else{
                bubble(arr,last,j+1);

            }
        }
        else {
            bubble(arr, last-1, 1);
        }
    }
}
