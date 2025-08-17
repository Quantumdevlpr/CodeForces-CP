import java.util.*;

public class Day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = num;   // usually result starts from 0 in Bit++ problem

        for (int i = 0; i < num; i++) {
            String statement = sc.next();

            if (statement.equals("X++")) {
                result++;
            } 
            else if (statement.equals("++X")) {
                ++result;
            } 
            else if (statement.equals("X--")) {
                result--;
            } 
            else if (statement.equals("--X")) {
                --result;
            }
        }

        System.out.print(result);
    }
}
