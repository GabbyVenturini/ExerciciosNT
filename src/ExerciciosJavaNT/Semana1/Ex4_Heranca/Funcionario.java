package ExerciciosJavaNT.Semana1.Ex4_Heranca;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;


    public Funcionario(String nome, String cpf, int idade, String rg, String cargo, double salario) {

        super(nome, cpf, idade, rg);
        this.cargo=cargo;
        this.salario=salario;
    }

    public String getCargo() {

        return cargo;
    }

    public void setCargo(String cargo) {

        this.cargo = cargo;
    }

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }
}

