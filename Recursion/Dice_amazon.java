public class Dice_amazon {
    public static void main(String[] args) {
      dice("",4);
    }
    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        int i;
        for(i=1;i<=target;i++){
            dice(p+i,target-i);
        }
    }
}
