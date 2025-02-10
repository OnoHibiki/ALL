import java.util.*;
public class C144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int battle = sc.nextInt();
        int win = 0 ;
        
        for(int i = 0 ; i < battle ; i ++){
            char alice = sc.next().charAt(0);
            char bob = sc.next().charAt(0);
            
            if(alice == 'G' && bob == 'C' || alice == 'C'&& bob == 'P' || alice == 'P' && bob == 'G'){
                win ++ ;
            }
            
        }
        
        System.out.println(win);
        
        
    }
}