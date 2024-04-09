import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        long nP, nD = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Insíra o número: ");
        nP = in.nextLong();
        for (long i = 1; i <= nP; i++){
            if(nP % i == 0){
                nD++;
            }
        }
        if(nD == 2){
            System.out.println(nP +" é um número primo!");
        }else{
            System.out.println(nP +" não é um número primo!");
        }
    }
}