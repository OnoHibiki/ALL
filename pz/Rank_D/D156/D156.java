import java.util.*;
public class D156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area = sc.nextInt();
        int humans = sc.nextInt();
        
        int answer = Multiplication(area,humans) ;
        
        System.out.println(answer);
    }
    
    public static int Multiplication(int area,int humans){
        return area * humans ;
    }
}