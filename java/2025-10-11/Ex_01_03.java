import java.util.*;

public class Ex_01_03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double [] n = new double[3];
       
        for(int i = 0; i < 3; i++){
        n[i] =  sc.nextDouble();
        }
        System.out.printf("%.3f,%.3f,%.3f" ,n[2], n[1], n[0]);
    }
}