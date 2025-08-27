import java.util.Scanner;

public class testEstadistica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] datos = new double[10];

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            datos[i] = input.nextDouble();
        }

        Estadistica est = new Estadistica(datos);

        System.out.printf("El promedio es %.2f%n", est.calcularPromedio());
        System.out.printf("La desviación estándar es %.5f%n", est.calcularDesviacion());

        input.close();
    }
}