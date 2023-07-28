public class one_duplicatefind {
    public static void main(String[] args) {
        int arr[]={2,3,4,2,3,5,5};
        int i;
        int ans=0;
        for(i=0;i<arr.length;i=i+1){
            ans=ans^arr[i];
        }
        System.out.println(ans);
    }
}
