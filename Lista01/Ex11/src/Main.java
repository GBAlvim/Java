import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double temp, res;
        Scanner in = new Scanner(System.in);
        System.out.println("Coloque a temperatura em celcius: ");
        temp = in.nextDouble();
        res = temp * 1.8 + 32;
        System.out.println("A temperatura em °F é: " + res);
    }
}