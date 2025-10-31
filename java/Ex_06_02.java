import java.util.*;
/*
制作日　2025/10/31
プログラムの目的
標準入力から 1～10 個の整数を読み取り、
1) その平均値（小数点以下 1 桁）を出力し、
2) 続けて各整数と平均値の差（整数値 - 平均値）を1行ずつ出力する。
という操作を行う
プログラムの解説
標準入力に与えられた数値をリストに格納し、
1）リストの長さから−1とするべき条件を指定する
2）各整数と平均値の差を計算する
*/

public class Ex_06_02{
    public static void main(String[]args){
        //標準入力から値を受け取るための準備として、リストを用意する
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        //値をリストに格納する
        while(sc.hasNext()){
            num.add(sc.nextInt());
        }
        //与えられた数値がいくつあるのかを明確にする
        int length = num.size();
        //−1を出力するべき条件を指定する
        if(length == 0 || length > 10){
            System.out.println(-1);
        }else{
            //拡張for文を用いて与えられた数値の総和を求める
            int sum = 0;
            
            for(int i: num){
                sum += i;
            }
            
            //与えられた数値の平均値を求める
            double mean = sum / (double)length;
            System.out.printf("%.1f\n", mean);
            
            for(int j: num){
                double diff = j - mean;
                System.out.printf("%d:%.1f\n", j, diff);
            }
        }
    }
}
