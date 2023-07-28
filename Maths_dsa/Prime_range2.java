public class Prime_range2 {
    public static void main(String[] args) {
        int a=20;
        boolean arr[]=new boolean[a+1];
        checkprime(a,arr);

    }
    static void checkprime(int a,boolean arr[]){
        int i,j;
        int x=(int)Math.sqrt(a);
        for(i=2;i<=x;i=i+1){
            if(arr[i]==false){
                for(j=i*2;j<a;j=j+i) {
                    arr[j]=true;
                }

            }
        }
        for(i=0;i<a;i++){
            if(arr[i]==false) {
                System.out.print(i+" ");
            }
    }
    }
}
