import java.util.*;
/*
製作者　鈴木孝紀
制作日　2025/10/28
プログラムの目的
標準入力で受け取った c1, c2, s に対し、c1 ≤ c2 のときに c1〜c2 の範囲で
sの倍数となる摂氏温度だけを華氏(小数1桁)へ変換し、「摂氏:華氏」の形式で
1行ずつ出力する。
プログラムの解説
int 型で c1, c2, s を読み込み、c1 から c2 までを走査する。
各温度 i について i % s == 0（s の倍数）を満たすときだけ、
F = 9.0/5.0 * i + 32 の式で華氏へ変換し、printf で小数第1位まで出力する。
出力は行頭に空白を入れず、半角で「i:F」の形式とする。c1 > c2 の場合は
何もしない。
*/

public class Ex_05_02{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int s = sc.nextInt();
        
        for(int i = c1; i <= c2; i++){
            if (c1 < c2){
                if(i%s == 0){
                    double t = 9.0/5.0 * i + 32;
                    System.out.print(i + ":");
                    System.out.printf("%.1f\n", t);
                }
                
            }else{
               return;
            }
        }
    }
}
