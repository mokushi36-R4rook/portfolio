 Ex_03_01.java
/*
制作日　：2025/10/20
対応言語：Java

■ 問題（要約 / Summary）
標準入力から正の整数を1つ読み取り，その値が「4桁」なら "y"，それ以外は "n" を出力する。

■ 要件
- 入力：int として読み込む（正の整数）
- 出力：半角文字，行頭に空白なし（"y" または "n"）

■ 使い方（例）
入力例:  1234
出力例:  y
*/
```java
import java.util.*;

public class Ex_03_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.close();

        
        if (i <= 9999) {
            if (i > 999) {
                System.out.println("y");
            } else {
                System.out.println("n");
            }
        } else {
            System.out.println("n");
        }
    }
}

/* ---------------------------------------------------------------------
   ▼ 別の“よりスッキリ”書く方法
   ---------------------------------------------------------------------

// ① 範囲チェックを1行にまとめる（読みやすい定番）
public class Ex_03_01_Compact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.close();

        boolean isFourDigits = (i >= 1000 && i <= 9999);
        System.out.println(isFourDigits ? "y" : "n");
    }
}

// ② 文字列長で判定（負号や先頭ゼロの扱いに注意：本課題は正の整数前提）
public class Ex_03_01_StringLen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.close();

        String s = String.valueOf(i);
        System.out.println((i > 0 && s.length() == 4) ? "y" : "n");
    }
}

// ③ 汎用：桁数を算出して判定（0の扱いに注意）
public class Ex_03_01_DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.close();

        if (i <= 0) {
            System.out.println("n"); // 正の整数のみ対象
            return;
        }
        int digits = (int) Math.log10(i) + 1;
        System.out.println(digits == 4 ? "y" : "n");
    }
}

【補足】
- 本課題では ① が最も意図が明確で、境界値（999/1000/9999/10000）も読み取りやすく、実務でも好まれます。
- ② は簡潔ですが、負号や文字列長に依存するため “数値としての4桁” という意図がやや曖昧になり得ます。
- ③ は任意桁判定への拡張に便利ですが、0 の扱いや浮動小数の誤差を考慮する必要があります。
--------------------------------------------------------------------- */
