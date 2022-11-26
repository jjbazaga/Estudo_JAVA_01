package meupacote;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        Integer n = sc.nextInt();

        Integer[] vetor = new Integer[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0){
                System.out.printf(vetor[i] + "  ");
            }
        }
    }
}
