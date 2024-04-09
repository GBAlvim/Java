import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n, r;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira um número: ");
        n = in.nextDouble();
        r = Math.sqrt(n);
        if (n >= 0) {
            System.out.println(r);
        }else{
            System.out.println("Valor inválido");
        }
    }
}