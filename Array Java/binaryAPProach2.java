public class binaryAPProach2 {
    public static void main(String[] args) {
        int []arr={1,2,5,7,45,67};
        int target=68;
        int ans=findinarr(arr,target);
        System.out.println(arr[ans]);

    }
    static int findinarr(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
