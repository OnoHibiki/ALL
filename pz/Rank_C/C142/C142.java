import java.util.*;
public class C142 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String likeFood = sc.nextLine();
        int menus = sc.nextInt();//不要だが入力されるので
        //結果配列使わずnemusでfor文にしたほうがメモリ効率はいいらしい  
        sc.nextLine();//改行文字消費
        
        String[] foods = sc.nextLine().split(" ");
        
        boolean thisLikeFood = false ;
        
            for(String food : foods){
                if(food.equals(likeFood)){
                    thisLikeFood = true;
                    break ;
                }
            }
        
        if(thisLikeFood){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}