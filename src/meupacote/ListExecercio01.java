package meupacote;

import java.util.*;

public class ListExecercio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionario = new ArrayList<>();

        System.out.print("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();
        System.out.println();

        System.out.println("Registrando novos funcionários:");
        for (int i = 0; i < n; i++) {
            System.out.println("Funcionário nº " + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();
            funcionario.add(new Funcionario(id, nome, salario));
            System.out.println();
        }

        System.out.println("Lista de funcionários:");
        for (Funcionario obj : funcionario) {
            System.out.println(obj);
        }
        System.out.print("Entre com Id do funcionário a receber aumento: ");
        Integer numero = sc.nextInt();
        Funcionario funcionario_Encontrado = funcionario.stream().filter(func -> func.getId().equals(numero)).findFirst()
                .orElseThrow(() -> new RuntimeException("Funcionario não encontrado"));

        System.out.print("Entre com percentual de aumento: ");
        double taxa = sc.nextDouble();
        funcionario_Encontrado.aumentoSalario(taxa);
        for (Funcionario obj : funcionario) {
            System.out.println(obj);
        }

    }

}
