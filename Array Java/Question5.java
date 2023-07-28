public class Question5 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 9, 12, 13, 14, 67, 89, 90};
        int target = 14;
        int ans = limits(arr, target);
        System.out.println(ans);
    }

    static int limits(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int ns = end + 1;
            end = end + (end + 1 - start);
            start = ns;
        }
        return findinarr(arr, target, start, end);
    }

    static int findinarr(int[] arr, int target, int start, int end) {


        if (target > arr[arr.length - 1]) {
            return 0;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (start == arr.length) {
                return 0;
            }
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
