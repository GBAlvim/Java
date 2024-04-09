import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double vel, res;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira a velocidade em Km/h: ");
        vel = in.nextDouble();
        res = vel/3.6;
        System.out.println("A velocidade em m/s é: " + res);

    }
}