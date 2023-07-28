public class subset {
    public static void main(String[] args) {
    String ri="";
    String lf="abc";
    sub("",lf);


    }
    static void sub(String ri,String lf){
        if(lf.isEmpty()){
            System.out.println(ri);
            return;
        }
        char ch=lf.charAt(0);
        sub(ri+ch,lf.substring(1));
        sub(ri,lf.substring(1));

    }
}
