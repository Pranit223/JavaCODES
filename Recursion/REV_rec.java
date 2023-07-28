public class REV_rec {
    public static void main(String[] args) {

        rev(1234);
        System.out.println(sum);
    }
    static int sum=0;
    static void rev(int num){
        int rem;
        if(num==0){
            return;
        }
        rem=num%10;
        sum=sum*10+rem;
        rev(num/10);
    }
}
