package ExerciciosJavaNT.Semana2.Ex4_Interface;

public class UsuarioStandard implements Usuario {
    public static void main(String[] args) {

    }

    public double getValorDesconto(double valorProduto) {
        if (valorProduto > 200) {
            return valorProduto * 0.15;
        }
        return 0.0;
    }

    @Override
    public String getTipoUsuario() {
        return "Standart";
    }

    @Override
    public String getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 200) {
            return String.format("%.2f", valorFrete * 0.1);
        }
        return String.format("%.2f", valorFrete);
    }
}
