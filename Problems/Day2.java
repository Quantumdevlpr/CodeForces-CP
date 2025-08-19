// Chewbaсca and Number 
import java.util.*;
public class Day2 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String number = sc.next();
     char[] ch = number.toCharArray();
     for(int i = 0 ; i < ch.length ; i++){
        int digit = ch[i] - '0';
        int inverted = 9 - digit;
        if(inverted <  digit){
            if(i == 0 && inverted == 0){
                continue;
            }
            ch[i] = (char)(inverted + '0');
        }
     }
     System.out.println(new String(ch));
    }
    }

