import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int N;
        System.out.println("Digite um número: ");
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        System.out.println("A soma de todos os números inteiros de 1 até " + N + " é: " + somaAteN(N));

    }
    public static int somaAteN(int N) {

        if (N <= 0) {
            System.out.println("N deve ser maior que 0.");
            return 0;
        }

        int soma = 0;
        for (int i = 1; i <= N; i++) {
            soma += i;
        }
        return soma;
    }
}

