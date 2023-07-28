///Integer.MAX_value


//SUM OF DIGITS OF A NUMBER.
public class SumOFdig_REC {
    public static void main(String[] args) {
        System.out.println(sumofdigit(1111));
    }
    static int sumofdigit(int num){
        if(num==0){
            return num;
        }
        return (num%10)+sumofdigit(num/10);
    }
}

