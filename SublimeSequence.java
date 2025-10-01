import java.util.Scanner;

public class SublimeSequence {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n ; i >0  ; i--){
            int num = sc.nextInt();
            int occ = sc.nextInt();
            if(occ % 2 == 0){
                System.out.println(0);
            }else{
                 System.out.println(num);
            }
           
        }
   }
}