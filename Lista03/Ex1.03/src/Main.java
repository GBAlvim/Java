import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int number;
        System.out.print("Qual tabuada deseja calcular? ");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + "x" + i + " = " + (number*i));
        }

    }
}