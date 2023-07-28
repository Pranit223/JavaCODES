public class Binarysearch {
    public static void main(String[] args) {
     int arr[]={1,3,5,7,9};
     int target=9;
     int s=0;
     int e=arr.length-1;
        System.out.println(binary(arr,target,s,e));
    }
    static int mid;
    static int binary(int []arr,int target,int s,int e){
        mid=s+((e-s)/2);
        if(s>e){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return binary(arr,target,s,e=mid-1);
        }
            return binary(arr,target,s=mid+1,e);

    }
}
