import java.util.Scanner;

public class Ex_01_02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 10){
            System.out.println("[   " + n + "]");
        }else if(n < 100){
            System.out.println("[  " + n + "]");
        }else if(n < 1000){
            System.out.println("[ " + n + "]");
        }else{
            System.out.println("[" + n + "]");
        }
        
    }
}