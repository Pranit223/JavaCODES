public class fibbo {
    public static void main(String[] args) {
        int x=0;
        int y=1;
        int z=1;
        int i=0;
        while(i<10){
            System.out.print(" "+x);
            y=z;
            z=x;
            x=y+z;
            i=i+1;
        }
    }
}
