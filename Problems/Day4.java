import java.util.*;
public class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //n, k, l, c, d, p, nl, np
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        int amount = k*l;
        int quantity = amount   /n;
        int limes = c*d;
        int salt = p/np;
        int result = Math.min(Math.min(quantity,limes),salt);
        System.out.println(result/n);
        sc.close();
    }
}
