import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 10: ");
        int n = scanner.nextInt();

        boolean f = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == n) {
                System.out.println("O número " + n + " foi encontrado na posição " + i + " do vetor.");
                f = true;
                break;
            }
        }

        if (!f) {
            System.out.println("Valor não encontrado.");
        }
    }
}