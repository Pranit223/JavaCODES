///square root of a number using newton ramson method


public class sqrtofnumber {
    public static void main(String[] args) {
        int num=40;

        System.out.print(sqrt(num));
    }
    static double sqrt(int num){
        double root;
        double nun;
        double x=num;
        while(true){
            root=0.5*(x+(num/x));
            if(Math.abs(root-x)<1){
                break;
            }
            else{
                x=root;
            }
        }
        return root;
    }
}
