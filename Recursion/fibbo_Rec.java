public class fibbo_Rec {
    public static void main(String[] args) {
        int ans=fibbo(3);
        System.out.println(ans);

    }
    static int fibbo(int num){
        if(num<2){
            return num;
        }
        return fibbo(num-1)+fibbo(num-2);
    }
}
