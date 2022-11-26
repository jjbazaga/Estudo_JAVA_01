package meupacote;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double soma = 0.0, media = 0.0;
        Integer n;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();
        Double[] vetor = new Double[n];
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }
        media = soma/vetor.length;
        System.out.println();
        System.out.printf("MEDIA DO VETOR = " + String.format("%.3f\n", media));
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < media){
                System.out.printf(String.format("%.1f\n", vetor[i]));
            }
        }
        sc.close();
    }
}
