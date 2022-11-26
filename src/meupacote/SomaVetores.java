package meupacote;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Integer n, valor;

        System.out.print("Quantos valores vai ter cada vetor? ");
        n = sc.nextInt();
        Integer[] vetorA = new Integer[n];
        Integer[] vetorB = new Integer[n];
        Integer[] vetorC = new Integer[n];

        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i < n; i++){
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for(int i = 0; i < n; i++){
            vetorB[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for(int i = 0; i < n; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }
    }
}
