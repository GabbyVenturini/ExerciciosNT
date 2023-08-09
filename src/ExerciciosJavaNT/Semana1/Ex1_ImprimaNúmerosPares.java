package ExerciciosJavaNT.Semana1;

public class Ex1_ImprimaNúmerosPares {
    public static void main(String[] args) {
        System.out.println("Numeros Pares de 0 a 100.");
       int valor=100;
       for(int i=0; i <=valor;i++){
           if (i % 2 == 0){
               System.out.println(i);
           }
       }
    }
}
