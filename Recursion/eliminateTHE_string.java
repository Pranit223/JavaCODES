public class eliminateTHE_string {
    public static void main(String[] args) {
        String str="baccda";
        int s=0;
        seperate(str,s);
    }
    static void seperate(String str,int s){
        if(s==str.length()){
            return;
        }
        if(str.charAt(s)=='a'){
            seperate(str,s+1);
        } else  {
            System.out.print(str.charAt(s));
            seperate(str,s+1);


        }
    }
}
