import java.util.Scanner;
public class EstadisticaMolecular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numeros = new double[10];
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = input.nextDouble();
        }
        double promedio = calcularPromedio(numeros);
        double desviacion = calcularDesviacion(numeros, promedio);
        System.out.printf("El promedio es %.2f%n", promedio);
        System.out.printf("La desviación estándar es %.5f%n", desviacion);
        input.close();
    }
    public static double calcularPromedio(double[] datos) {
        double suma = 0;
        for (double valor : datos) {
            suma += valor;
        }
        return suma / datos.length;
    }

    public static double calcularDesviacion(double[] datos, double promedio) {
        double sumaCuadrados = 0;
        for (double valor : datos) {
            sumaCuadrados += Math.pow(valor - promedio, 2);
        }
        return Math.sqrt(sumaCuadrados / (datos.length-1));
    }
}
