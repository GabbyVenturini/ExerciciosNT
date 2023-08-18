package ExerciciosJavaNT.Semana2;
//Todo: 1 - Implemente um método que receba um número e imprima o resultado do fatorial deste número.
public class ex1_FatorialDoNumero {
        public static void main(String[] args) {
            int numero = 5; //Todo: Altere o número para o qual deseja calcular o fatorial
            int fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        public static int calcularFatorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * calcularFatorial(n - 1);
            }
        }
    }


    //Todo: int numero = 5;: Define o número para o qual você deseja calcular o fatorial. Neste caso, é 5.

    //Todo: int fatorial = calcularFatorial(numero);: Chama a função calcularFatorial passando o número como argumento e armazena o resultado
    // do fatorial na variável fatorial.

    //Todo: System.out.println("O fatorial de " + numero + " é: " + fatorial);: Imprime na saída o resultado do cálculo do fatorial.

    //Todo: public static int calcularFatorial(int n) { ... }: Esta é a função calcularFatorial que realiza o cálculo do fatorial de um número.

    //Todo: O bloco if verifica se o número é igual a 0 ou 1. Se for, retorna 1, pois o fatorial de 0 e 1 é sempre 1.

    //Todo: Se o número não for 0 ou 1, a função chama a si mesma recursivamente para calcular o fatorial de n - 1, multiplicando o resultado por n.

    //Todo: No final, o programa calcula e imprime o fatorial do número fornecido (neste caso, 5). O fatorial de um número n é o produto de todos
    // os inteiros positivos menores ou iguais a n. Portanto, o fatorial de 5 é 5 * 4 * 3 * 2 * 1 = 120.