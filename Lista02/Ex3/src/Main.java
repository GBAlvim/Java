import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double n1, n2, m;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira a primeira nota: ");
        n1 = in.nextInt();
        System.out.println("Insira a segunda nota: ");
        n2 = in.nextInt();
        m = (n1 + n2) / 2;
        if (m >= 50.0){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}