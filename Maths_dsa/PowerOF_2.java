public class PowerOF_2 {
    public static void main(String[] args) {
        int num=16;
        if((num & num-1)==0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
