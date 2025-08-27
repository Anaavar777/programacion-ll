import java.util.Scanner;
public class testEcuacionCuadratica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);
        double discriminante = ecuacion.getDiscriminante();

        if (discriminante > 0) {
            System.out.printf("La ecuación tiene dos raíces %.5f y %.5f%n", ecuacion.getRaiz1(), ecuacion.getRaiz2());
        } else if (discriminante == 0) {
            System.out.printf("La ecuación tiene una raíz %.5f%n", ecuacion.getRaiz1());
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }

        input.close();
    }
}
