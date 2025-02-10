import java.util.*;
public class D212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nagasa = sc.nextInt();
        int nagasa10 = tenTimes(nagasa);
        
        System.out.println(nagasa10);
        
    }
    
    public static int tenTimes(int nagasa){
       return  nagasa * 10;
    }
    
    
}