//FIND ALL THE DUPLICATES


import java.util.ArrayList;
import java.util.List;

public class Question_4 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,3,2,1};

        System.out.println(missing_num(nums));
    }

    static List<Integer> missing_num(int[] nums) {
        int i = 0;
        int temp = 0;
        while (i < nums.length) {
            if (nums[i]== nums[nums[i]-1]) {
                i = i + 1;
                continue;

            } else {
                temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
                i = i;
            }
        }
        List<Integer>ans=new ArrayList<>();
        int j = 0;
        while (j < nums.length) {
            if (nums[j] == j+1) {

                j = j + 1;
            } else {
                ans.add(nums[j]);
                j=j+1;

            }

        }
        return ans;
    }
}
