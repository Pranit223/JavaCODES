public class Prime_Range {
    public static void main(String[] args) {
        Rangeprime(20);
    }
    static int Rangeprime(int a){
        int i,j;

        for(i=2;i<a;i++){
            int count=0;
            int x=(int)(Math.sqrt(i));
            for(j=2;j<=x;j++){
                if(i%j==0){
                    count=1;
                    break;
                }
                else{
                    count=count;
                }
            }
            if(count==1){
                System.out.println(i+" "+"is not a prime");
            }
            else{
                System.out.println(i+" "+"is prime");
            }
        }
        return 1;
    }
}
