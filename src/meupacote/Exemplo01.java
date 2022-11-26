package meupacote;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o numero de medidas de altura: ");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        double soma = 0;

        System.out.println("Entre com os valores de altura: ");
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }
        System.out.println("Média das alturas de pessoas: " + (String.format("%.2f", soma / 3)));
        sc.close();
    }
}
