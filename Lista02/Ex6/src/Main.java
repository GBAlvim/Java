import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int op;
        Scanner in = new Scanner(System.in);
        System.out.println("Selecione a opção desejada (entre opção 5 a opção 9): ");
        op = in.nextInt();
        if (op == 5) {
            System.out.println("Opção 5: Água");
        }else if (op == 6) {
            System.out.println("Opção 6: Chá");
        }else if (op == 7) {
            System.out.println("Opção 7: Café");
        }else if (op == 8) {
            System.out.println("Opção 8: Energético");
        }else if (op == 9) {
            System.out.println("Opção 9: Milkshake");
        }else{
            System.out.println("Opção inválida!");
        }
    }
}