package ExerciciosJavaNT.Semana1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ex2_ImprimaNumerosPrimos {
    public static void main(String[] args) {
        int valor = 1000;
        boolean primo;
        for (int i = 2; i <= valor; i++) {
            primo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println("Numero primo: " + i);
            }
        }
    }
}

//Apanhei pra caramba pra caramba, mas consegui, já fiz ele mais uma 4 vezes do zero pra fixar bem.