import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int n1, n2;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        n1 = in.nextInt();
        System.out.println("Insira o segundo número: ");
        n2 = in.nextInt();
        if (n1 > n2){
            System.out.println("O maior número é: " + n1);
        } else {
            System.out.println("O maior número é: " + n2);
        }
    }
}