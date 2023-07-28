public class unique_in_array {
    public static void main(String[] args) {
        int [] arr={2,2,4,4,5,3,5,2,1,6,7};
        int i,j;

        for (i=0;i<arr.length;i=i+1){
            int k=0;
            for(j=0;j<arr.length;j=j+1){
                if (arr[i]==arr[j]){
                  k=k+1;
                    }
                else{
                    continue;
                }
                }
            if(k==1){
                System.out.println(arr[i]);
            }

            }
        }
    }
