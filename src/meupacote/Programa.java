package meupacote;

import java.util.Scanner;

public class Programa
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n;

        Aluguel[] vetor = new Aluguel[10];

        System.out.print("Quantos quartos serão alugados? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Aluguel nº " + (i + 1) + ":");
            System.out.print("Nome do(a) locatário(a): ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("E_mail: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            vetor[quarto] = new Aluguel(nome, email);
        }
        System.out.println();
        System.out.println("Quartos ocupados:");
        for(int i = 0; i < 10; i++){
            if(vetor[i] != null){
                System.out.println(i + ": " + vetor[i]);
            }
        }
        for(Aluguel obj: vetor){
            if(obj != null){
                System.out.println(obj);
            }
        }
    }
}
