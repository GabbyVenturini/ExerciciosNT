package ExerciciosJavaNT.Semana1;

public class Ex3_TextoPalindromo {
    public static void main(String[] args) { //Ame o poema.
        String frase = "Ame o poema";
        frase=frase.replaceAll(" ","");
        String reversa = "";

        for(int i = (frase.length()-1); i >= 0; i--){
            reversa += frase.charAt(i);
        }

        if(reversa.equalsIgnoreCase(frase)){
            System.out.println("É palindromo!");
        }else{
            System.out.println("Não é palindromo!");
        }
        System.out.println("Palavra original:" +frase.toLowerCase());
        System.out.println("Palavra Reversa: " +reversa.toLowerCase());

        //palindromoSolucao2("Ame o poemaff");
    }
    private static void palindromoSolucao2(String palavra){
        String palavraFormatada = palavra.replaceAll(" ", "").toLowerCase();
        StringBuilder palavraReversa = new StringBuilder(palavraFormatada).reverse();
        System.out.println("É um palindromo? " + palavraFormatada.equals(palavraReversa.toString()));

    }
}

