import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.0");
        int n = sc.nextInt();
        float n1, n2, n3, media;

        for (int i = 0; n>i; i++){

            n1 = sc.nextFloat(); n2 = sc.nextFloat(); n3 = sc.nextFloat();

            media = (n1*2 + n2*3 + n3*5)/10;

            System.out.println(df.format(media));

        }
        sc.close();
    }
}
