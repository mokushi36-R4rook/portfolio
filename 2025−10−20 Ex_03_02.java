import java.util.*;
/*
制作日　2025/10/20
プログラムの目的
整数値を標準入力に入力すると、
時間帯を表す単語を標準出力に出力するプログラム
プログラムの説明
標準入力から取り込んだ整数を時間帯ごとに場合分けをし、
適切な時間帯を出力する
*/
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
