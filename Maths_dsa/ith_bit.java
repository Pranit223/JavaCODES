public class ith_bit {
    public static void main(String[] args) {
        int a=10;
        int nth=3;
        int ans=a | (1<<nth-1);
        System.out.println(ans);
    }
}
