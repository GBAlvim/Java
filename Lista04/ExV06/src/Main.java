import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.print("Vetor Original: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        int tamanho = vetor.length;
        int temp;

        for (int i = 0; i < tamanho / 2; i++) {
            temp = vetor[i];
            vetor[i] = vetor[tamanho - 1 - i];
            vetor[tamanho - 1 - i] = temp;
        }

        System.out.print("Vetor Invertido: ");
        for (int i = 0; i < vetor.length; i++) {
        }
        System.out.println(Arrays.toString(vetor));
    }
}