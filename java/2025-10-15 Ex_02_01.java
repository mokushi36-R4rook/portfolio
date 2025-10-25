import java.util.*;

public class Ex_02_01{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double s = r * r * Math.PI;
        System.out.printf("%.2f%n",s);
    }
}