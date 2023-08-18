package ExerciciosJavaNT.Semana2.Ex4_Interface;
//Todo: 4 - Crie uma interface chamada usuário, ela deve possuir os seguintes métodos:
public class UsuarioBase implements Usuario {
    public static void main(String[] args) {
    }

    @Override
    public double getValorDesconto(double valorProduto) {
        if (valorProduto > 300) {
            return valorProduto * 0.05;
        }
        return 0.0;
    }

    @Override
    public String getTipoUsuario() {
        return "base";
    }

    @Override
    public String getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 300) {
            return String.format("%.2f", valorFrete * 0.95);
        }
        return String.format("%.2f", valorFrete);
    }
}


