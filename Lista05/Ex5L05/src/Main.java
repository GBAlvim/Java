import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {4, 8, 15, 16, 23, 42};
        int valorProcurado;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\nQual valor procurado?");
        Scanner in = new Scanner(System.in);
        valorProcurado = in.nextInt();

        int posicao = encontrarPosicao(vetor, valorProcurado);

        if (posicao != -1) {
            System.out.println("O valor " + valorProcurado + " está na posição " + posicao + " do vetor.");
        } else {
            System.out.println("O valor " + valorProcurado + " não foi encontrado no vetor.");
        }
    }

    public static int encontrarPosicao(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}



//Algoritmo já inicia com valor x para encontrar
/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] vetor = new int[8];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = i * 2;
            System.out.println(vetor[i]);

        }
        System.out.println("Qual número você busca?");
        Scanner in = new Scanner(System.in);
        int buscado = in.nextInt();


        boolean found = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        while(inicio <= fim) {
            meio = (int) ((inicio + fim) / 2);
            if (vetor[meio] == buscado){
                found = true;
                break;
            }else if (vetor[meio] < buscado) {
                inicio = meio + 1;

            }else{
                fim = meio - 1;
            }
        }
        if (found == true) {
            System.out.println("Achou");
        }else{
            System.out.println("Não achou");
        }
    }
}*/
