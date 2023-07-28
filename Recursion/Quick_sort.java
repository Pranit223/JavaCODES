import java.util.Arrays;

public class Quick_sort {
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] nums, int low, int hi) {
      if(low>=hi){
          return;
      }
      int s=low;
      int e=hi;
      int m=s+(e-s)/2;
      int piviot=nums[m];
      while(s<=e){
          while(nums[s]<piviot){
              s++;
          }
          while(nums[e]>piviot){
              e--;
          }
          if(s<=e) {
              int temp = nums[s];
              nums[s] = nums[e];
              nums[e] = temp;
              s++;
              e--;
          }
      }
      sort(nums,low,e);
      sort(nums,s,hi);
    }
}

