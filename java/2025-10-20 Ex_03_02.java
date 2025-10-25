import java.util.*;

public class Ex_03_02{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        
        if(time < 5){
            System.out.println("night");
        }else if(time <= 11){
            System.out.println("morning");
        }else if(time <= 16){
            System.out.println("afternoon");
        }else if(time <= 21){
            System.out.println("evening");
        }else if(time <= 23){
            System.out.println("night");
        }else{
            System.out.println("none");
        }
    }
}