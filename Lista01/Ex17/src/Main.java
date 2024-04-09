import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double vIni, aCel, temPer, vFim;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira a velocidade inicial: ");
        vIni = in.nextDouble();
        System.out.println("Insira a aceleração: ");
        aCel = in.nextDouble();
        System.out.println("Insira o tempo de percurso: ");
        temPer = in.nextDouble();
        vFim = (vIni + aCel) * temPer;
        System.out.println("A velocidade é de: " + vFim + "km/h");

    }
}