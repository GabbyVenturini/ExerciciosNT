package ExerciciosJavaNT.Semana2.Ex4_Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario usuarioBase = new UsuarioBase();
        Usuario usuarioStandard = new UsuarioStandard();
        Usuario usuarioPremium = new UsuarioPremium();

        String descontoBase = "Compras acima de 300: 5%";
        String descontoStandard = "Compras acima de 200: 15%";
        String descontoPremium = "Compras acima de 200: 30%";

        String freteBase = "Compras acima de 300 frete 5%";
        String freteStandard = "Compras acima de 200 frete 10%";
        String fretePremium= "Compras acima de 100 frete grátis";

        double valorProduto, valorFrete = 0;

        System.out.println("Desconto para usuário Base: " + descontoBase);
        System.out.println("Desconto para usuário Standard: " + descontoStandard);
        System.out.println("Desconto para usuário Premium: " + descontoPremium);

        System.out.println("_____________________________________________________________________");

        System.out.println("Frete para usuário Base: " + freteBase);
        System.out.println("Frete para usuário Standard: " + freteStandard);
        System.out.println("Frete para usuário Premium: " + fretePremium);

        System.out.println("_____________________________________________________________________");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Selecione seu tipo de Usuário:\n3 1-Base\n 2- Standard\n 3- Premium: \n");
        int tipoUsuario = scanner.nextInt();

        Usuario usuario;
        switch (tipoUsuario) {
            case 1:
                usuario = new UsuarioBase();
                break;
            case 2:
                usuario = new UsuarioStandard();
                break;
            case 3:
                usuario = new UsuarioPremium();
                break;
            default:
                System.out.println("Tipo de usuário inválido.");
                scanner.close();
                return;
        }

        System.out.print("Digite o valor do produto: ");
        double valorDoProduto = scanner.nextDouble();

        double desconto = usuario.getValorDesconto(valorDoProduto);
        String frete = usuario.getValorFreteDesconto(valorFrete, valorDoProduto);

        System.out.println("Tipo de Usuário: " + usuario.getTipoUsuario());
        System.out.println("Desconto: " + desconto);
        System.out.println("Frete: " + frete);

        scanner.close();
    }
}
