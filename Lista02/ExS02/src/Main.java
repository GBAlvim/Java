import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double n1, n2, res;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        n1 = in.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = in.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        int escolha = in.nextInt();

        res = 0;

        switch (escolha) {
            case 1:
                res = n1 + n2;
                break;
            case 2:
                res = n1 - n2;
                break;
            case 3:
                res = n1 * n2;
                break;
            case 4:
                if (n2 != 0) {
                    res = n1 / n2;
                } else {
                    System.out.println("Não é possível dividir por zero.");
                    return;
                }
                break;
            default:
                System.out.println("Escolha inválida. Por favor, escolha uma operação válida.");
                return;
        }

        System.out.println("O resultado da operação escolhida é: " + res);
    }
}