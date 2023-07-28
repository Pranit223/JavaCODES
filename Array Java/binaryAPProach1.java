public class binaryAPProach1 {
    public static void main(String[] args){
        int[] arr = {2,3,6,7,9,10,34};
        int start = 0;
        int target = 1;
        int end = arr.length - 1;
        int mid = 0;
        int x = 0;
        while(start <= end){
            mid = start + (end-start) / 2;
            if(target <arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else if(target == arr[mid]){
                System.out.println(mid);
                 x = 1;
                break;
            }
        }
        if(x == 0){

            System.out.println("invalid input");
        }
    }
}