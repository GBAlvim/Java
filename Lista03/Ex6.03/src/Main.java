import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, maior, menor;
        Scanner in = new Scanner(System.in);
        System.out.print("Insíra o primeiro número: ");
        n1 = in.nextInt();
        System.out.print("Insíra o segundo número: ");
        n2 = in.nextInt();
        maior = Math.max(n1, n2);
        menor = Math.min(n1, n2);
        for (int i = menor; i <= maior; i++) {
            System.out.println(i);
        }

    }
}