import java.util.*;

public class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();   // number of friends
        int k = sc.nextInt();   // number of bottles
        int l = sc.nextInt();   // ml per bottle
        int c = sc.nextInt();   // number of limes
        int d = sc.nextInt();   // slices per lime
        int p = sc.nextInt();   // grams of salt
        int nl = sc.nextInt();  // ml needed per toast per person
        int np = sc.nextInt();  // grams salt needed per toast per person
        
        // Total drink (ml)
        int totalDrink = k * l;
        int possibleFromDrink = totalDrink / nl;
        
        // Total lime slices
        int totalSlices = c * d;
        
        // Total possible from salt
        int possibleFromSalt = p / np;
        
        // The limiting factor
        int totalToasts = Math.min(possibleFromDrink, 
                            Math.min(totalSlices, possibleFromSalt));
        
        // Each friend gets an equal number of toasts
        System.out.println(totalToasts / n);
        
        sc.close();
    }
}
