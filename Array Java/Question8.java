//1.FIND PIVIOT ELEMENT
//2.BINARY SEARCH ON LEFT SIDE
//3.IF NOT FOUND BINARY SEARCH ON S///
//1.FIND PIVOT ELEMENT
//2.IF target lies on left side BINARY SEARCH ON LEFT SIDE
//3.IF TARGET lies on right side check on right
// FOUND BINARY SEARCH ON SECOND SIDE

public class Question8 {
        public static void main(String[] args) {
            int[] nums = {3,5,1};
            int target = 0;
            int before = findpiviot(nums);
            if (before == -1) {
                int sorted = binary(nums, target, 0, nums.length - 1);
                System.out.println(sorted);
            }
            else {
                if (target == nums[before]) {
                    System.out.println(before);
                } else if (target >= nums[0]) {
                    int ans= binary(nums, target, 0, before-1);
                    System.out.println(ans);
                } else {
                    int ans1=binary(nums, target, before+1, nums.length - 1);
                    System.out.println(ans1);

                }
            }
        }

    static int findpiviot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid != nums.length-1 && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid != 0 && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            else if(nums[mid]<nums[start]){
                end=mid;
            }
            else{
                start=mid+1;
            }

        }
        return -1;
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

