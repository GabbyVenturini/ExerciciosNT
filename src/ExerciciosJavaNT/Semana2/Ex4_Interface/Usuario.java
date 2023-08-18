package ExerciciosJavaNT.Semana2.Ex4_Interface;

public interface Usuario {
    double getValorDesconto(double valorProduto);
    String getTipoUsuario();
    String getValorFreteDesconto(double valorFrete, double valorProduto);
}
