import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o valor de X (base): ");
            int x = scanner.nextInt();
            System.out.print("Digite o valor de Y (expoente): ");
            int y = scanner.nextInt();


            if (y < 0) {
                System.out.println("O expoente deve ser maior ou igual a zero.");
            } else {
                long res = calcPotencia(x, y);
                System.out.println(x + " elevado a " + y + " é igual a " + res);
            }

        }

        public static long calcPotencia(int x, int y) {
            if (y == 0) {
                return 1;
            } else {
                // Multiplicar (x, y -1) por x
                return x * calcPotencia(x, y - 1);
            }
        }
    }
