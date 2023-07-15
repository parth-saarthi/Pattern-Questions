// 5.  *
//     **
//     ***
//     ****
//     *****
//     ****
//     ***
//     **
//     *

public class pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < 2 * n; i++) {
            if (i < n) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            }
            if (i >= n) {
                for (int j = 0; j < n - (i - n + 1); j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
