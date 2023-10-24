import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; n>i; i++){
            float n1 = sc.nextFloat();
            float n2 = sc.nextFloat();

            if (n2 == 0){
                System.out.println("Divisão Impossível.");

            }
            else {
                float div = n1/n2;
                System.out.println(div);
            }

        }
        sc.close();
    }
}
