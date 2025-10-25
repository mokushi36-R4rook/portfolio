import java.util.*;

public class Ex_02_02{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        
        int b = (a / 1000) % 10;
        System.out.println(b);
    }
}