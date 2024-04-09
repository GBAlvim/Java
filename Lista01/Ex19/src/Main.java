import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double a, b, c, raiz, raiz1, raiz2, delta;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o coeficiente a: ");
        a = in.nextDouble();
        System.out.println("Insira o coeficiente b: ");
        b = in.nextDouble();
        System.out.println("Insira o coeficiente c: ");
        c = in.nextDouble();
        delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            raiz = -b / (2 * a);
            System.out.println("A equação possui uma raiz real: " + raiz);
        } else {
            raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais:");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }

    }
}