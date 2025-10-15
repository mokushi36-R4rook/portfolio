
/*
制作日　2025/10/15
プログラムの目的
標準入力から値を半径とする縁の面積を求める

プログラムの解説
標準入力から値を整数値として受け取り、実数値にて円
の面積を演算する。その後、それを出力する。
*/
import java.util.*;

public class Ex_02_01{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double s = r * r * Math.PI;
        System.out.printf("%.2f%n",s);
    }
}
