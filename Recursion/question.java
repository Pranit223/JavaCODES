public class question {
    public static void main(String[] args) {
        int []arr={2,1,3,4,5};
        int count=0;
        int n=5;
        for (int i = 0; i <n ; i++) {
            if(i==n-1){
                count=count+1;
                System.out.println(count);
                break;
            }
            if(arr[i]<arr[i+1]){
                count=count+1;
            }

        }
    }
}
