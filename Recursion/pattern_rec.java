public class pattern_rec {
    public static void main(String[] args) {
        pattern2(5, 0);
    }

    static void pattern2(int r, int c) {
        if (r == 1) {
            System.out.print("*");
            return;
        }
        if (r > c) {

            pattern2(r, c + 1);
            System.out.print("*");
        }
        if (r == c) {

            pattern2(r - 1, 0);
            System.out.println();
        }
    }
}

