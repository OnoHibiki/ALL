import java.util.*;
public class C160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int boxs = sc.nextInt();//箱の数♡
        
        int totalRain = 0 ;
        
        for(int i = 0 ; i < boxs ; i++){
            int rain = sc.nextInt();
            totalRain += rain ;
        }
        
        int rainAve = (int)(Math.ceil((double)totalRain / boxs)) ;
        //このキャストははたして最適なのか
        System.out.println(rainAve);
        
        
    }
}