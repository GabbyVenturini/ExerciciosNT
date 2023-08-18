package ExerciciosJavaNT.Semana2.Ex4_Interface;

public class UsuarioPremium implements Usuario {
    @Override
    public double getValorDesconto(double valorProduto) {
        if (valorProduto > 200) {
            return valorProduto * 0.30;
        }
        return 0.0;
    }

    @Override
    public String getTipoUsuario() {
        return "Premium";
    }

    @Override
    public String getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 100) {
            return String.format("Frete grátis");
        }
        return String.format("%.2f", valorFrete * 0.1);
    }

}
