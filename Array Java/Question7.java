
//1.FIND PEAK ELEMENT
//2.BINARY SEARCH ON LEFT SIDE
//3.IF NOT FOUND BINARY SEARCH ON SECOND SIDE
public class Question7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int before = findinarr(arr);
        int first = binary(arr, target, 0, before);
        if (first !=-1){
            System.out.println(first);
        }
        else {
            int sec=binary(arr,target,before,arr.length-1);
            System.out.println(sec);
        }
    }


    static int findinarr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start != end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }

        }
        return start;
    }

    static int binary(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}