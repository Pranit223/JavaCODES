public class numofdigit {
    public static void main(String[] args) {
        int num=4;
        int base=2;
        int ans=(int)(Math.log(num)/ Math.log(base))+1;
        System.out.println(ans);
    }
}
