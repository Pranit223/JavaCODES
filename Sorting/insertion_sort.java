import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int []arr={1, 5, 3, 4, 3, 5, 6};
        int i,j;
        int temp=0;
        for(i=0;i<arr.length-1;i=i+1){
            for(j=i+1;j>0;j=j-1){
                if(arr[j]<arr[j-1]){
                  temp=arr[j];
                  arr[j]=arr[j-1];
                  arr[j-1]=temp;

                    }
                else{
                    break;
                }
                }
            }
        System.out.println(Arrays.toString(arr));
        }
    }

