public class Question_6 {
    public static void main(String[] args) {
        int []arr={1,2,0};

        System.out.println((duplicate(arr)));
    }

    static int duplicate(int[] nums) {
        int i = 0;
        int temp = 0;
        while (i < nums.length) {
            if(nums[i]>0) {
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
            else{
                i=i+1;
            }
        }
        int j = 0;
        while (j < nums.length) {
            if (nums[j] == j + 1) {

                j = j + 1;
            } else {
                return j+1;


            }

        }

        return nums.length;
    }
}
