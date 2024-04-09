
public class Main {
    public static void main(String[] args) {


        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) {
            vetor[i] = i + 1;
        }

        System.out.println();
        System.out.println("Vetor na ordem inversa:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}