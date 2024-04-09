import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double med, res;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira a media em milimetros: ");
        med = in.nextDouble();
        res = med/25.4;
        System.out.println("A medida em polegadas é: " + res);

    }
}