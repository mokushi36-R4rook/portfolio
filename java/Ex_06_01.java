import java.util.*;
//制作日　2025/10/31
public class Ex_06_01{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        
        for(int i = 0; i <= 4; i++){
            num.add(sc.nextInt());
        }
        
        for(int j = 4; j >= 0; j--){
            System.out.println(num.get(j));
        }
    }
}
