import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.##");
        int n = sc.nextInt();

        for (int i = 1; n >= i; i++) {
            double quad = Math.pow(i,2);
            double cubo = Math.pow(i,3);
            System.out.println(i+" "+df.format(quad)+" "+df.format(cubo));

        }
    }
}
