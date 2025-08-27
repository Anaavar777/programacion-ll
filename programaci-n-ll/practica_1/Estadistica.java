public class Estadistica {
    private double[] datos;

    public Estadistica(double[] datos) {
        this.datos = datos;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double valor : datos) {
            suma =suma + valor;
        }
        return suma / datos.length;
    }
    public double calcularDesviacion() {
        double promedio = calcularPromedio();
        double suma = 0;
        for (double valor : datos) {
            suma = suma +Math.pow(valor - promedio, 2);
        }
        return Math.sqrt(suma / (datos.length-1));
    }
}