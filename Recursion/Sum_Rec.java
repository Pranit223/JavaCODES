
//SUM OF NUMBERS FROM N TO 1.

public class Sum_Rec {
    public static void main(String[] args) {
        int ans=sum(5);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n==1){
            return n;
        }
        return n+sum(n-1);
    }
}
