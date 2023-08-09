package ExerciciosJavaNT.Semana1.Ex4_Heranca;

import ExerciciosJavaNT.Semana1.Ex4_Heranca.Funcionario;

public class Motorista extends Funcionario {
    private String cnh;
    private String placaCarro;


    public Motorista(String nome, String cargo, String placaCarro, String cpf, int idade, String rg, double salario, String cnh) {
        super(nome, cpf, idade, rg, cargo, salario);
        this.cnh = cnh;
        this.placaCarro = placaCarro;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }
}


