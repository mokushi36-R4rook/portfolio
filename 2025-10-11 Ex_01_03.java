```java
/*制作日　2025/10/11
プログラムの目的　
標準入力に3つの実数値を入力すると，入力した値を逆の順で，
標準出力に1行で出力する。
プログラムの解説
まず、Scannerメソッドを用いて標準入力から値を実数値で受け取る。
次に、その値を配列に順に代入できるようにする。
最後に得られた配列を順番を入れ替えて出力する。
*/
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
