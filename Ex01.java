import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (1 <= x && x <= 1000) {
            for (int n = 1; n <= x; n++) {
                if (n % 2 != 0) {
                    System.out.println(n);
                }
            }
        }
        else {
            System.out.println("Número Inválido.");
        }
        sc.close();
    }
}
