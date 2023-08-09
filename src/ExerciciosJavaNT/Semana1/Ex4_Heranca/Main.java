package ExerciciosJavaNT.Semana1.Ex4_Heranca;

public class Main {
    public static void main(String[] args) {

        Motorista motorista = new Motorista("Marcos", "motorista","DT7F45","855.658.054-58", 55, "5863214895", 2.500, "258685428558");
        Motorista motorista2 = new Motorista("Carlos","motorista","TG4Y85", "855.658.054-58", 55, "5863214895", 2.500, "54848483484");

        System.out.println("Morista 1: " + motorista.getNome()+", "+motorista.getCargo()+", "+motorista.getPlacaCarro()+".");
        System.out.println("Morista 2: " +motorista2.getNome()+", "+motorista2.getCargo()+", "+motorista2.getPlacaCarro()+".");
    }

}
