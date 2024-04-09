import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double R, A, C;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o raio: ");
        R = in.nextDouble();
        System.out.println("Insira o circulo: ");
        C = in.nextDouble();
        A = Math.PI * Math.pow(R, 2);
        System.out.println("A área do Circulo é: " + A);
    }
}