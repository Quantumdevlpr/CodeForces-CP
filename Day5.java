import java.util.*;

public class Day5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            num[i] = sc.nextInt();
        }
        
        int sscore = 0;
        int  dscore = 0;
        int left = 0;
        int right = num.length-1;
        for(int i = 0 ; i < num.length ;i++){
            if(i%2 == 0){
                if(num[left] > num[right]){
                    sscore+=num[left];
                    left++;
                }else{
                    sscore+=num[right];
                    right--;
                }
            }
            else{
                if(num[left]>num[right]){
                    dscore += num[left];
                    left++;
                }else{
                 dscore += num[right];
                 right--;
                }
            }
        }
        System.out.println(sscore +" " + dscore);
        
    }
}