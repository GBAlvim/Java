import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1;
        Scanner in = new Scanner(System.in);
        System.out.println("Insíra umnúmero: ");
        n1 = in.nextInt();
        if (n1 % 2 == 0) {
            System.out.println("PAR!");
        }else{
            System.out.println("ÍMPAR!");
        }
    }
}