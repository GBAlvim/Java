import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Calculadora Geométrica");
        System.out.println("1. Círculo");
        System.out.println("2. Triângulo Retângulo");
        System.out.println("3. Retângulo");

        System.out.print("Escolha a forma (1, 2 ou 3): ");
        int escolha = in.nextInt();

        switch (escolha) {
            case 1:
                calcularCirculo();
                break;
            case 2:
                calcularTrianguloRetangulo();
                break;
            case 3:
                calcularRetangulo();
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha entre 1, 2 ou 3.");
        }
    }

    private static void calcularCirculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;

        exibirResultados("Círculo", area, perimetro);
    }

    private static void calcularTrianguloRetangulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a base do triângulo retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Informe a altura do triângulo retângulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;
        double hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        double perimetro = base + altura + hipotenusa;

        exibirResultados("Triângulo Retângulo", area, perimetro);
    }

    private static void calcularRetangulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o comprimento do retângulo: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Informe a largura do retângulo: ");
        double largura = scanner.nextDouble();

        double area = comprimento * largura;
        double perimetro = 2 * (comprimento + largura);

        exibirResultados("Retângulo", area, perimetro);
    }

    private static void exibirResultados(String forma, double area, double perimetro) {
        System.out.println("\nResultados para " + forma + ":");
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}
