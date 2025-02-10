import java.util.*;
public class C154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int merchandises = sc.nextInt();
        int discountLine = sc.nextInt();
        
        int[] prices = new int[merchandises] ;
        
        for(int i = 0 ; i < merchandises ; i++){
            prices[i] = sc.nextInt();
        }
        
        int maxPrice = 0 ;
        
        for(int price : prices){
            
            if(price >= discountLine && price > maxPrice){
                maxPrice = price ;
            }
        }
        
        int totalCost = 0 ;
        
        for(int cost : prices){
                totalCost += cost ;
        }
        
        if(maxPrice != 0){
            totalCost -= maxPrice / 2 ;
        }
        
        System.out.println(totalCost);
            
        
        
    }
}