```java
// 課題[3-3]のソースファイル / Ex_03_03.java
/*
制作日　：2025/10/20
対応言語：Java

■ 問題（要約）
Aさん, Bさん, Cさん, Dさん の得点（0～100, かつ全員異なる）をこの順で標準入力から読み取り，
最高得点者の名前（A/B/C/D）を出力する。

■ 要件
- 入力：A→B→C→D の順に int として読み込む（0～100，かつ全員異なる）
- 出力：最高得点者の名前（"A" / "B" / "C" / "D"）
- 出力は半角，行頭に空白なし

■ 使い方（例）
入力:
90 75 82 99
出力:
D

■ 実装方針（このファイルのメイン実装）
- Math.max を入れ子にして4つの整数から最大値を求め，
  その値がどの変数（A/B/C/D）由来かを if-else で判定して出力する。
- 読みやすさのため，元の提出コードの構造を基本的に踏襲しています。

※ 末尾に「よりスッキリ書く別解」をコメントで2案（配列＋最大インデックス法／逐次更新法）として添付。
*/

import java.util.*;

public class Ex_03_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        /* Math.max()メソッドを用いて最大値を探す。
           二つの値までしか同時に比べられないので、入れ子で2回用いる。 */
        int x = Math.max(Math.max(A, B), Math.max(C, D));

        if (x == A) {
            System.out.println("A");
        } else if (x == B) {
            System.out.println("B");
        } else if (x == C) {
            System.out.println("C");
        } else { // x == D
            System.out.println("D");
        }

        sc.close();
    }
}

/* ============================================================
   別解①：配列＋最大インデックス法（拡張に強く，分岐が少ない）
   ------------------------------------------------------------
   - 名前と点数の対応関係を配列に持たせ，ループ1本で最大インデックスを求める。
   - 人数が増えてもロジックはそのまま拡張可能。
   - 全員異なる点数という前提が崩れても，最初に現れた最大を自然に選ぶ。

import java.util.*;

public class Ex_03_03_ArrayVer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[4];
        char[] names  = {'A', 'B', 'C', 'D'};

        for (int i = 0; i < 4; i++) {
            scores[i] = sc.nextInt();
        }
        sc.close();

        int maxIdx = 0;
        for (int i = 1; i < 4; i++) {
            if (scores[i] > scores[maxIdx]) maxIdx = i;
        }
        System.out.println(names[maxIdx]);
    }
}
   ============================================================ */

/* ============================================================
   別解②：逐次更新法（ifは3回だけでシンプル）
   ------------------------------------------------------------
   - 先頭（A）を暫定1位として採用し，B→C→D でより大きければ更新する。
   - Math.max の入れ子や4分岐が不要で読みやすい。

import java.util.*;

public class Ex_03_03_RollingMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        sc.close();

        int maxScore = A;
        char winner = 'A';

        if (B > maxScore) { maxScore = B; winner = 'B'; }
        if (C > maxScore) { maxScore = C; winner = 'C'; }
        if (D > maxScore) { maxScore = D; winner = 'D'; }

        System.out.println(winner);
    }
}
   ============================================================ */
```
