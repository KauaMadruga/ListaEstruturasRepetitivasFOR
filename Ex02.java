import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = 0, out = 0, x, n = sc.nextInt();

        for (int i = 0; n>i; i++){
            x = sc.nextInt();
            if (x >= 10 && x <= 20){
                in ++;
            }
            else {
                out ++;
            }
        }
        System.out.println(in+" in\n"+out+" out");
        sc.close();
    }
}
