public class Pattern {
    public static void main(String[] args) {
        int r, c, s;
        int n = 5;
        int temp = 2;
        for (r = 1; r <= 2 * n; r = r + 1) {

            for (c = r; c == r; c = c + 1) {
                System.out.print("*");
            }
            if (r <= n) {
                for (s = 1; s <= r - 2; s = s + 1) {
                    System.out.print(" ");
                }

                for (c = temp; c == r; c = c + 1) {
                    System.out.print("*");
                    temp = temp + 1;
                }
            } else {
                for (s = 1; s <= (2 * n) - r - 1; s = s + 1) {
                    System.out.print(" ");
                }
                if(r!=2*n) {
                    System.out.print("*");
                }
            }

            System.out.println();

        }
    }
}


