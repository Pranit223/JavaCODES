public class Prime_orNot {
    public static void main(String[] args) {
        int ans=checkprime(20);
        if(ans==1){
            System.out.println("not a prime");
        }
        else{
            System.out.println("prime");
        }
    }
    static int checkprime(int a){
        int i;
        int checktill=(int)Math.sqrt(a);
        for(i=2;i<=checktill;i++){
            if(a%i==0){
                return 1;
            }
        }
        return 0;
    }
}
