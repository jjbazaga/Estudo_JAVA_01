package meupacote;

import java.util.Objects;

public class Funcionario {
    @Override
    public boolean equals(Object o) {
        if (Objects.isNull(o)) {
            return false;
        }
        Funcionario funcionarioParametro = (Funcionario) o;
        if(this.id.equals(funcionarioParametro.getId())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, salario);
    }

    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public Double aumentoSalario(double taxa) {
        return salario += taxa * salario;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + String.format("%.2f", salario) +
                '}';
    }
}
