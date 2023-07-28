///XOR of all numbers between a and b


public class XOR_bwtnums {
    public static void main(String[] args) {
        int a=3;
        int b=9;
        int i;
        int ans=0;
        for(i=a;i<=b;i=i+1){
            ans=ans^i;
        }
        System.out.println(ans);
    }

}
