
public class Main {
    public static void main(String[] args) {


        for (int nT = 1; nT <= 10; nT++) {
            System.out.println("Tabuada do " + nT + ":");

            for (int m = 1; m <= 10; m++) {
                int res = nT * m;
                System.out.println(nT + " x " + m + " = " + res);
            }
            System.out.println();
        }
    }
}