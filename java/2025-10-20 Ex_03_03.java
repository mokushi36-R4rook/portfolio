import java.util.*;

public class Ex_03_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int x = Math.max(Math.max(A, B), Math.max(C, D));

        if (x == A) {
            System.out.println("A");
        } else if (x == B) {
            System.out.println("B");
        } else if (x == C) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        sc.close();
    }
}