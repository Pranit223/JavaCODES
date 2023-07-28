///magic number=6  ->110
/// 1*5^3+1*5^2+0*5^1

public class Magic_num {
    public static void main(String[] args) {
        int num=6;
        int five=5;
        int ans=0;
        int last;
        while(num>0){
           last=num & 1;
           num=num>>1;
           ans=(last *five)+ans;
           five=five*5;
        }
        System.out.println(ans);
    }
}
