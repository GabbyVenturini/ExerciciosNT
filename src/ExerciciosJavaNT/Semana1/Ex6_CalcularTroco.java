package ExerciciosJavaNT.Semana1;

import java.util.Scanner;

public class Ex6_CalcularTroco {
        public static void calcularTroco(double custo, double pagamento) {
            Scanner scanner = new Scanner(System.in);
            double troco = pagamento - custo;
            System.out.println("Valor do troco: R$ " + troco);

            int[] notasMoedas = {100, 50, 20, 10, 5, 2, 1, 50, 25, 10, 5};

            String[] descricaoDasNotasMoedas = {"nota de 100", "nota de 50", "nota de 20", "nota de 10", "nota de 5", "nota de 2",
                    "moeda de 1", "moeda de 50 centavos", "moeda de 25 centavos", "moeda de 10 centavos", "moeda de 5 centavos"};

            System.out.println("Troco com as menores notas e moedas possíveis: ");

            for (int i = 0; i < notasMoedas.length; i++){
                int quantidade = (int) (troco / notasMoedas[i]);

                if (quantidade > 0){
                    System.out.println(quantidade + " - " + descricaoDasNotasMoedas[i]);
                    troco -= quantidade * notasMoedas[i];
                }
            }
        }

        public static void main(String[] args){
            double custo = 54.00;
            double pagamento = 60.00;

            calcularTroco(custo, pagamento);
        }
    }
