package ExerciciosJavaNT.Semana2;

import java.util.Scanner;
//Todo: 3 -  Implemente a cifra de Vigenère para criptografar e descriptografar uma mensagem.
import java.util.Scanner;

public class Ex3_Vigenere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.print("Digite a palavra-chave: ");
        String chave = scanner.nextLine();

        System.out.print("Escolha 1 para criptografar ou 2 para descriptografar: ");
        int opcao = scanner.nextInt();

        String resultado = (opcao == 1) ? vigenere(texto, chave, true) : vigenere(texto, chave, false);

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

    public static String vigenere(String texto, String chave, boolean criptografar) {
        StringBuilder resultado = new StringBuilder();
        int tamanhoChave = chave.length();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            char base = Character.isUpperCase(c) ? 'A' : 'a';
            int deslocamento = chave.charAt(i % tamanhoChave) - base;
            int modificador = criptografar ? 1 : -1;

            if (Character.isLetter(c)) {
                c = (char) ((((c - base + modificador * deslocamento + 26) % 26) + base));
            }

            resultado.append(c);
        }

        return resultado.toString();
    }
}

//Todo: StringBuilder resultado = new StringBuilder();: Cria um objeto StringBuilder para construir o resultado da operação.
//
//Todo: int tamanhoChave = chave.length();: Obtém o tamanho da palavra-chave.
//
//Todo: O loop for percorre cada caractere do texto inserido.
//
//Todo: char c = texto.charAt(i);: Obtém o caractere atual do texto.
//
//Todo: char base = Character.isUpperCase(c) ? 'A' : 'a';: Determina a base para os cálculos com base no caso do caractere.
//
//Todo: int deslocamento = chave.charAt(i % tamanhoChave) - base;: Calcula o deslocamento com base no caractere atual da palavra-chave.
//
//Todo: int modificador = criptografar ? 1 : -1;: Determina se o deslocamento é positivo (para criptografar) ou negativo (para descriptografar).
//
//Todo: O bloco if verifica se o caractere é uma letra, e então aplica a fórmula da cifra de Vigenère para criptografar ou descriptografar o caractere.
//
//Todo: resultado.append(c);: Adiciona o caractere resultante ao resultado.
//
//Todo: return resultado.toString();: Retorna o resultado final da operação como uma string.

