package meupacote;

public class Aluguel {
    public String nome;
    public String email;

    public Aluguel(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String toString() {
        return nome + ", " + email;
    }
}
