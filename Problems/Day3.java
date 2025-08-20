import java.util.*;

public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oneRow = 0, oneCol = 0;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int val = sc.nextInt();
                if (val == 1) {
                    oneRow = i;
                    oneCol = j;
                }
            }
        }
        int moves = Math.abs(oneRow - 3) + Math.abs(oneCol - 3);
        System.out.println(moves);
    }
}