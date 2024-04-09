import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, n2, media;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira uma nota: ");
        n1 = in.nextDouble();
        System.out.println("Insira outra nota: ");
        n2 = in.nextDouble();
        media = (n1 + n2)/2;
        System.out.println("Média: " + media);
    }
}