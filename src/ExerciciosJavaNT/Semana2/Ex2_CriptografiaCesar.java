package ExerciciosJavaNT.Semana2;

import java.util.Scanner;
//Todo: 2 - Implemente a cifra de César para criptografar e descriptografar uma mensagem.

public class Ex2_CriptografiaCesar {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o texto: ");
            String texto = scanner.nextLine();

            System.out.print("Digite o número de deslocamento: ");
            int deslocamento = scanner.nextInt();

            System.out.println("Escolha uma opção:");
            System.out.println("1 - Criptografar");
            System.out.println("2 - Descriptografar");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            String resultado = "";

            if (opcao == 1) {
                resultado = criptografar(texto, deslocamento);
            } else if (opcao == 2) {
                resultado = descriptografar(texto, deslocamento);
            } else {
                System.out.println("Opção inválida.");
                return;
            }

            System.out.println("Resultado: " + resultado);

            scanner.close();
        }

        public static String criptografar(String texto, int deslocamento) {
            StringBuilder criptografado = new StringBuilder();

            for (char c : texto.toCharArray()) {
                if (Character.isLetter(c)) { //
                    char base = Character.isUpperCase(c) ? 'A' : 'a';
                    char caractereCriptografado = (char) (((c - base + deslocamento) % 26) + base);
                    criptografado.append(caractereCriptografado);
                } else {
                    criptografado.append(c);
                }
            }

            return criptografado.toString();
        }

        public static String descriptografar(String texto, int deslocamento) {
            return criptografar(texto, 26 - deslocamento); //Todo: Descriptografar é o mesmo que criptografar com o deslocamento oposto
        }
    }

//Todo: for (char c : texto.toCharArray()): Isso cria um loop que percorre cada caractere do texto fornecido. Ele itera por cada caractere individual do texto.
//
//Todo: if (Character.isLetter(c)) {: Isso verifica se o caractere atual é uma letra. Se for uma letra, ele entra no bloco de código que executa a criptografia.
//
//Todo: char base = Character.isUpperCase(c) ? 'A' : 'a';: Isso determina a base para os cálculos. Se o caractere atual for maiúsculo, a base será 'A', caso contrário, será 'a'.
// Isso é importante porque a cifra de César opera em um sistema de coordenadas onde 'A' ou 'a' representam o início da sequência alfabética.
//
//Todo: char caractereCriptografado = (char) (((c - base + deslocamento) % 26) + base);: Esta linha realiza a criptografia do caractere atual. Ele subtrai a base para garantir que
// a letra seja tratada como um valor entre 0 e 25 (correspondente às letras do alfabeto), aplica o deslocamento para mover a letra, pega o resto da divisão por 26 para garantir
// que a letra volte ao início caso seja necessário, e finalmente adiciona a base novamente para obter o caractere criptografado.
//
//Todo: criptografado.append(caractereCriptografado);: Aqui, o caractere criptografado é adicionado ao resultado final, que está sendo construído na variável criptografado.
//
//Todo: else { criptografado.append(c); }: Se o caractere atual não for uma letra (como um espaço, pontuação, número, etc.), ele é adicionado diretamente ao resultado sem criptografia.

