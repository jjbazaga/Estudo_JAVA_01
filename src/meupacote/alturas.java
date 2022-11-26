package meupacote;

import java.io.Console;
import java.util.Locale;
import java.util.Scanner;

public class alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Console teclado = System.console();
        double soma = 0.0;

        System.out.print("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();
        Pessoas[] pessoas = new Pessoas[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.println();
            System.out.print("Nome: ");
            String Nome = sc.nextLine();
            sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoas[i] = new Pessoas(Nome, idade, altura);
            soma += altura;

        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%s\n", pessoas[i]);
        }
        System.out.println("Altura média: " + String.format("%.2f%n", soma / pessoas.length));
        sc.close();
    }
}

