import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;
        int fatorial = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Insira um número: ");
        num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial de " + num + " é: " + fatorial);

    }
}