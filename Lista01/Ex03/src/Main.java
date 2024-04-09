import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n, res;
        System.out.println("Insira um número: ");
        Scanner in = new Scanner(System.in);
        n = in.nextDouble();
        res = n/5;
        System.out.println(res);
    }
}