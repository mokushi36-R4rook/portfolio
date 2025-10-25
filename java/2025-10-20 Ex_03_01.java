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