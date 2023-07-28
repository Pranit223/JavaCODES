public class question1 {
    public static void main(String[] args) {
        int []nums={1,2,3,1};
        int i;
        int count=0;
        for (i = 0; i <nums.length ; i++) {
            for (int j = 0; j < nums.length ; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }

            }
            if (count>1){
                System.out.println("true");
                break;
            }

        }
        System.out.println("false");

    }
}
