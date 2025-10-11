
import java.util.*;
/*
制作日　2025/10/11
プログラムの目的
整数値から1000の位の値を取り出す。
プログラムの解説
まず、Scannerを用いて標準入力から整数値を受け取る。次に、
得られた値から１０００の位だけ取り出せるように演算を行う。
この結果の標準出力に出力する。
*/

public class Ex_02_02{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        
        int b = (a / 1000) % 10;
        System.out.println(b);
    }
}
