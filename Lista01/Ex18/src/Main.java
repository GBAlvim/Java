import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double a, b, res;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o coeficiente a: ");
        a = in.nextDouble();
        System.out.println("Insira o coeficiente b: ");
        b = in.nextDouble();
        if (a == 0) {
            System.out.println("Não é uma equação de 1° Grau!");
        } else {
            res = -b / a;
            System.out.println("A solução da equação " + a + "X + " + b + " = 0 é x = " + res);

        }
    }
}