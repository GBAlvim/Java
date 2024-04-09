import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double a, b, c, x1, x2, delta;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o coeficiente a: ");
        a = in.nextDouble();
        System.out.println("Insira o coeficiente b: ");
        b = in.nextDouble();
        System.out.println("Insira o coeficiente c: ");
        c = in.nextDouble();
        delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        }else{
            x1 = (b*-1 + Math.sqrt(delta))/(2*a);
            x2 = (b*-1 - Math.sqrt(delta))/(2*a);
            System.out.println("x1 = " + x1 + " e x2 = " +x2);
        }
    }
}