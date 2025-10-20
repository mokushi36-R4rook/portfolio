import java.util.*;
/*
製作者　鈴木孝紀
制作日　2025/10/20
プログラムの目的
2つの正の整数値について，その整数とその2乗値を1行にし、順に標準出力
に出力するプログラム
*/
public class Ex_04_01{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i = n; i <= m; i++){
            System.out.println(i + ":" + i*i);
        }
    }
}
