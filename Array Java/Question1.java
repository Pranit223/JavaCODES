public class Question1 {
    public static void main(String[] args) {
        int []arr={1,2,5,7,45,67};
        int target=54;
        int ans=findinarr(arr,target);
        System.out.println(ans);
    }
    static int findinarr(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        if (target > arr[arr.length - 1]) {
            return 0;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(start==arr.length){
                return 0;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else if(target==arr[mid]){
                return mid;
            }

        }
        return arr[start] ;
    }
}

