package meupacote;

import java.util.Scanner;

/**
 * @author magnolia
 */
public class ClasseScanner {

    public static void main(String[] args) {

        String nome, sexo, matricula;
        String campus;
        int ano;
        double nota1, nota2, media;


        Scanner entrada = new Scanner (System.in);
        String escola = "IFRN CAMPUS ";

        System.out.println("------------------------------");
        System.out.println("DIGITE AS INFORMAÇÕES DO ALUNO");
        System.out.println("------------------------------");

        System.out.print("Nome completo: ");
        nome = entrada.nextLine();

        System.out.print("Sexo: ");
        sexo = entrada.nextLine();

        System.out.print("Ano de nascimento (yyyy): ");
        ano = entrada.nextInt();

        System.out.print("Campus: ");
        campus = entrada.nextLine();

        System.out.print("Matrícula (Apenas números): ");
        matricula = entrada.nextLine();

        System.out.print("Nota 1: ");
        nota1 = entrada.nextDouble();

        System.out.print("Nota 2: ");
        nota2 = entrada.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("--------------");
        System.out.println("SITUAÇÃO FINAL");
        System.out.println("--------------");

        System.out.println(escola.concat(campus).toUpperCase());
        System.out.println("Matrícula nº: " + matricula);
        System.out.println("Aluno(a): " + nome.toUpperCase() + " - Sexo: " + sexo.substring(0,1).toUpperCase() + " - Nascido(a) em: " + ano);

        if (media >= 60){

            System.out.println("Status: APROVADO(A)");
        }
        else {
            System.out.println("Status: REPROVADO(A)");
        }
    }
}