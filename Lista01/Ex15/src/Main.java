import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, d, res;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o diâmetro: ");
        d = in.nextDouble();
        System.out.println("Insira a altura: ");
        a = in.nextDouble();
        res = 3.14 * d * a;
        System.out.println("O volume é: " + res);
    }
}
