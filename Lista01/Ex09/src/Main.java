import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double dis, res;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira a distância em quilômetros: ");
        dis = in.nextDouble();
        res = dis/1.609;
        System.out.println("A distância em milhas é: " + res);

    }
}