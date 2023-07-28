public class maxinArray {
    public static void main(String[] args) {
        int[] arr = {1,6,5,19,2};
        int i;
        int j=arr[0];

        for(i=0;i<arr.length-1;i=i+1){
            if(arr[i]>j){
                j=arr[i];
            }
            else{
                j=j;
            }
        }
        System.out.println(j);

    }
}