import java.util.*;
public class C115 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cars = sc.nextInt();
        int trafficJam = sc.nextInt();
        
        int jamTotal = 0 ;
        
        for(int i = 0 ; i < cars -1 ; i++){
            int carInterval = sc.nextInt();
            
            if(carInterval <= trafficJam){
                jamTotal += carInterval ;
            }
            
        }
        
        System.out.println(jamTotal);
    }
}