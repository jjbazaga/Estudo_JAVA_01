import java.util.Locale;
import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a quantidade de registro: ");
        int n = sc.nextInt();
        Produto[] produto = new Produto[n];
        double soma = 0;

        System.out.println("Entre com o produto e o preço: ");
        for (int i = 0; i < produto.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double valor = sc.nextDouble();
            produto[i] = new Produto(name, valor);
            soma += produto[i].preco;
            System.out.println("Produto: " + produto[i]);
        }
        System.out.printf("Média de preço: " + String.format("%.2f", (soma / produto.length)));
        sc.close();
    }
}
