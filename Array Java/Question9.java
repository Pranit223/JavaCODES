public class Question9 {
    public static void main(String[] args) {
        int[] nums = {6, 7, 1, 2, 3, 4, 5};
        int ans=findpiviot(nums)+1;
        System.out.println(ans);
    }

    static int findpiviot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid != nums.length - 1 && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid != 0 && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            } else if (nums[mid] < nums[start]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
