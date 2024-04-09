import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, cat1, cat2;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira a base:  ");
        cat1 = in.nextDouble();
        System.out.println("Insira a altura: ");
        cat2 = in.nextDouble();
        a = (cat1 * cat2) / 2;
        System.out.println("A área do Triângulo Retângulo é: " + a);
    }
}