//rather checking is element is on correct index we have to compare value of "i" with correct index of i.


import java.util.Arrays;

public class Cycle_sort {
    public static void main(String[] args) {
        int [] arr={3,2,5,4,1};

        int i=0,temp;
        while(i<arr.length){
            if(arr[i]-1==i){
                i=i+1;
                continue;

            }
            else{
                temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
                i=i;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
