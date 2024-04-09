import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double b, a, res;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira a base: ");
        b = in.nextDouble();
        System.out.println("Insira a altura: ");
        a = in.nextDouble();
        res = (b * a) /3;
        System.out.println("O volume é: " + res);
    }
}