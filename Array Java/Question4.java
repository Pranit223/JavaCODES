import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        int []ar={1,2,2,2,7,8,9,10,11};
        System.out.println(Arrays.toString(find(ar, 2)));
    }

    static int[] find(int[] arr, int target){
        int[] ans = {-1,-1};
        int s = findindex(arr, target, true);
        int e = findindex(arr, target, false);
        ans[0]=s;
        ans[1]=e;
        return ans;
    }
    static int findindex(int arr[],int target,boolean findstart) {
        int ans = -1;
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] > target) {
                e = mid ;
            } else if (arr[mid] < target) {
                s = mid;
            } else {
                ans = mid;
                if (findstart) {
                    e = mid ;
                } else {
                    s = mid ;
                }
            }
        }
        return ans;


    }
}

