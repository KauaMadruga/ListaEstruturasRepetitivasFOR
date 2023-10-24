import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fatorial = 1, n = sc.nextInt();

        for (int i = 1; i <= n  ; i++){
                fatorial *= i;
        }

        System.out.println(fatorial);
        sc.close();
    }
}
