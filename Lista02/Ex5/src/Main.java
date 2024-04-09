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
        if (m >= 8.5){
            System.out.println("Conceito A!");
        } else if (m >= 7 && m < 8.5){
            System.out.println("Conceito B!");
        } else if (m >= 5 && m < 7) {
            System.out.println("Conceito C");
        } else {
            System.out.println("Comceito D!");
        }
    }
}