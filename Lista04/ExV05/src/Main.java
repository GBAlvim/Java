public class Main {
    public static void main(String[] args) {

        int[] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] v2 = new int[v1.length];

        for (int i = 0; i < v1.length; i++) {
            v2[i] = v1[v1.length - 1 - i];
        }

        System.out.print("Vetor Original: ");
        for (int j : v1) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.print("Vetor Invertido: ");
        for (int j : v2) {
            System.out.print(j + " ");

        }
    }
}
