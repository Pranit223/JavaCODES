import java.util.Arrays;

public class pratice2 {
    public static void main(String[] args) {

        int[] nums={2,0,2,1,1,0};

       ans(nums);


    }
    static void ans(int[] nums){
        int [] answer=new int[nums.length];
        int temp=0;
        int count_zero=0;
        int count_1=0;
        int count_2=0;

        for (int i = 0; i < nums.length; i++) {
            switch (nums[i]) {
                case 0:
                    count_zero++;
                    break;
                case 1:
                    count_1++;
                    break;
                case 2:
                    count_2++;
                    break;
            }
        }
        int j=0;
        int k;
        int l;
            for (j = 0; j <count_zero ; j++) {
                answer[j]=0;
            }
            for (k =0 ; k <count_1 ; k++) {
                answer[j]=1;
                j++;
            }
            for ( l = 0; l <count_2 ; l++) {
                answer[j]=2;
                j++;
            }

        for (int i = 0; i <nums.length ; i++) {
            nums[i]=answer[i];
        }
    }
    
}

