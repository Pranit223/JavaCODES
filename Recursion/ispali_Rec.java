public class ispali_Rec {
    public static void main(String[] args) {

        System.out.println(ispali(1221));
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
    static boolean ispali(int num){
        rev(num);
        return num==sum;
    }
}
