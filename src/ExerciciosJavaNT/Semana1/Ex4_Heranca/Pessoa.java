package ExerciciosJavaNT.Semana1.Ex4_Heranca;

public class Pessoa {
    private String nome;
    private String cpf;
    private String rg;
    private int idade;

    public Pessoa(String nome, String cpf, int idade, String rg) {
        this.rg = rg;
        this.nome=nome;
        this.idade=idade;
        this.cpf=cpf;
    }

    public String getNome(){

        return nome;
    }
    public String getCpf(){

        return cpf;
    }
    public int getIdade(){

        return idade;
    }
    public String getRg(){

        return rg;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }
    public void setCpf(String cpf){

        this.cpf=cpf;
    }
    public void setRg (String rg){

        this.rg =rg;
    }
    public void setIdade (int idade){

        this.idade=idade;
    }
}
