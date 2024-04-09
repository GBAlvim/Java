import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com as três medidas: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a<b+c && a>Math.abs(b-c) &&
            b<a+c && b>Math.abs(a-c) &&
            c<b+a && c>Math.abs(b-a)) {
            if (a == b && a == c)
            System.out.println("Triângulo Equilátero");
            else if (a == b || a == c || b == c )
                System.out.println("Triângulo Isóceles");
            else
                System.out.println("Triângulo Escaleno");
        }else{
            System.out.println("Não é um triângulo!");
        }

    }
}