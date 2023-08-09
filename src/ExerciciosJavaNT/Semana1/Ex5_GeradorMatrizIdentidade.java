package ExerciciosJavaNT.Semana1;

public class Ex5_GeradorMatrizIdentidade {
    public static int[][] geradorMatrizIdentidade(int n) {
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            matriz[i][i] = 1;
        }
        return matriz;
    }

    public static void main(String[] args) {
        int numeroInteiro = 5;
        int[][] matriz = geradorMatrizIdentidade(numeroInteiro);
        for (int i = 0; i < numeroInteiro; i++) {
            for (int j = 0; j < numeroInteiro; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}