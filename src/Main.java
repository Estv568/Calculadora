import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r=0;
        int numero = 0;
        Scanner tcd = new Scanner(System.in);

        System.out.println("Digite um numero");
        numero = tcd.nextInt();

        for (int n = 1; n<11 ; n++){

            r = numero * n;

            System.out.println( numero+"x"+n+"=" + r );
        }

    }
}