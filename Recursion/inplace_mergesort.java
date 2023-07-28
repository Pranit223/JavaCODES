import java.util.Arrays;

public class inplace_mergesort {
    public static void main(String[] args) {
        int arr[]={8,3,4,12,5,6};
        merger_sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static void merger_sort(int arr[],int s,int e){

        if(e-s==1){
            return;
        }
        int mid=(s+e)/2;
        merger_sort(arr,s,mid);
        merger_sort(arr,mid,e);
        merge(arr,s,mid,e);

    }

    static int[] merge(int []arr,int s,int mid,int e){
        int nrr[]=new int [e-s];
        int i=s;
        int j=e;
        int k=0;
        while(e-s==1) {
            if (arr[i] < arr[j]) {
                nrr[k] = arr[i];
                i++;
                k++;
            }
            else if (arr[j] < arr[i]) {
                nrr[k]=arr[j];
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
            else if(j<arr.length){
                nrr[k]=arr[j];
                j++;
                k++;
            }
        }
        return nrr;
    }
}
