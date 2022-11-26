import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double soma = 0.0;

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número #" + (i + 1) + ": ");
            double numero = sc.nextDouble();
            vetor[i] = numero;
            soma += numero;
        }
        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++) {
            System.out.print("   " + vetor[i]);
        }
        System.out.println();
        System.out.printf("SOMA = " + String.format("%.2f%n", soma));
        System.out.println("MEDIA = " + String.format("%.2f%n", (soma / vetor.length)));
    }
}
