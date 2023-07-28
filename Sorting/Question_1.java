import java.util.Arrays;
//FIND THE MISSING NUMBER
public class Question_1 {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int ans=missing_Number(arr);
        System.out.println(ans);



    }
    static int missing_Number(int []nums){
        int i = 0;
        int j;

        int temp;
        while (i < nums.length) {
            if(nums[i]==nums.length){
                i=i+1;
            }
            else if (nums[i] == nums[nums[i]]) {
                i = i + 1;
                continue;

            } else {
                temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
                i = i;
            }
        }
        j=0;
        while(j<nums.length){
            if(nums[j]==j){

                j=j+1;
            }
            else{
                return j;

            }

        }
        return nums.length;

    }
}