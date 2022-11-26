package meupacote;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números inteiros voce vai digitar: ");
        int n = sc.nextInt();
        int[] impar = new int[n];

        if (n != 0 && n <= 10) {
            for (int i = 0; i < n; i++) {
                System.out.print("Digite o número #" + (i + 1) + ": ");
                int numero = sc.nextInt();
                if (numero < 0) {
                    impar[i] = numero;
                }
            }
            System.out.println("NUMEROS INTEIRO NEGATIVOS DO VETOR:");
            for (int j = 0; j < impar.length; j++) {
                if (impar[j] < 0) {
                    System.out.println(impar[j]);
                }
            }
        } else {
            System.out.println();
            System.out.println("VALOR FORA DOS LIMITES. TENTA NOVAMENTE!");
        }
        sc.close();
    }
}


