//FIND DUPLICATES



public class Question_3 {
    public static void main(String[] args) {
   int []arr={1,2,4,2,2};
   int ans=duplicate(arr);
        System.out.println(ans);
    }

    static int duplicate(int[] nums) {
        int i = 0;
        int temp = 0;
        while (i < nums.length) {
            if (nums[i] == nums[nums[i] - 1]) {
                i = i + 1;
                continue;

            } else {
                temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
                i = i;
            }
        }
        int j = 0;
        while (j < nums.length) {
            if (nums[j] == j+1) {

                j = j + 1;
            } else {
                return nums[j];


            }

        }
        return -1;
    }
}