import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int arr[]={8,3,4,12,5,6};
        arr=merger_sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] merger_sort(int arr[]){

    if(arr.length==1){
        return arr;
    }
        int mid=arr.length/2;
    int []left=merger_sort(Arrays.copyOfRange(arr,0,mid));
    int []right=merger_sort(Arrays.copyOfRange(arr,mid,arr.length));
    return merge(left,right);

    }

    static int[] merge(int arr[],int[]prr){
        int nrr[]=new int [arr.length+prr.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr.length && j<prr.length) {
            if (arr[i] < prr[j]) {
                nrr[k] = arr[i];
                i++;
                k++;
            }
            else if (prr[j] < arr[i]) {
                nrr[k]=prr[j];
                j++;
                k++;

            }
        }
        while(k<nrr.length) {
            if (i < arr.length) {
                nrr[k] = arr[i];
                i++;
                k++;
            }
            else if(j<prr.length){
                nrr[k]=prr[j];
                j++;
                k++;
            }
        }
        return nrr;
    }
}
