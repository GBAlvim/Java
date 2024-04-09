import java.util.Scanner;

public class EquacaoSegundoGrau {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a raiz x1 da equação do segundo grau:");
        double x1 = scanner.nextDouble();
        System.out.println("Digite a raiz x2 da equação do segundo grau:");
        double x2 = scanner.nextDouble();
        exibirEquacao(x1, x2);
    }
    public static void exibirEquacao(double x1, double x2) {
        double a = 1;
        double b = -(x1 + x2);
        double c = x1 * x2;

        System.out.println("A equação do segundo grau é: ");
        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
    }
}
