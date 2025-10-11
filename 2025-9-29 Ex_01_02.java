/*
制作日　2025/09/29
プログラムの目的
標準入力に4桁以下の正の整数値（1 ～ 9999）を入力すると，その整数値を 
[] で囲んで4桁（4桁未満の場合は右詰め）で標準出力に出力するプログラム
を目指した。
プログラムの解説
最初に標準入力からint型の数字を取り込む。次に、数字の桁数に応じ、適切に
右詰めできるように場合分けをする。
*/
```java
import java.util.Scanner;

public class Ex_01_02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 10){
/*1桁の数字の場合、”[（空白3つ分）”となるように調整し、標準出力に出力する
*/
            System.out.println("[   " + n + "]");
        }else if(n < 100){
/*２桁の数字の場合、”[（空白２つ分）”となるように調整し、標準出力に出力する
*/            
            System.out.println("[  " + n + "]");
        }else if(n < 1000){
/*３桁の数字の場合、”[（空白１つ分）”となるように調整し、標準出力に出力する
*/            
            System.out.println("[ " + n + "]");
        }else{
            System.out.println("[" + n + "]");
        }
        
    }
}
