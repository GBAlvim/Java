import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        System.out.println("Insira cinco números inteiros; ");
        Scanner in = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            number = in.nextInt();

            if (number > maior) {
                maior = number;
            }

            if (number < menor) {
                menor = number;
            }
        }

        System.out.println("O maior número digitado é: " + maior);
        System.out.println("O menor número digitado é: " + menor);
    }
}
