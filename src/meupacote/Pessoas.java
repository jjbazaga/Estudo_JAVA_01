package meupacote;

public class Pessoas {
    public String nome;
    public int idade;
    public double altura;

    public Pessoas(String nome) {
        this.nome = nome;
    }

    public Pessoas(int idade, double altura) {
        this.idade = idade;
        this.altura = altura;
    }

    public Pessoas(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
