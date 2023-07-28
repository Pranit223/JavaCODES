public class Question6 {
    public static void main(String[] args) {
        int[]ar={2,4,5,7,5,3,1};
        int ans=findinarr(ar);
        System.out.println(ans);

    }
    static int findinarr(int[]arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start != end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid+1]) {
                start =mid +1;
            }

        }
        return arr[start];
    }

}

