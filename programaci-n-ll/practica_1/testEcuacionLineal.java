import java.util.Scanner;
public class testEcuacionLineal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ngrese a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        EcuacionLineal ecuacion = new EcuacionLineal(a, b, c, d, e, f);

        if (ecuacion.tieneSolucion()) {
            System.out.println("x= " + ecuacion.getX() + ", y= " + ecuacion.getY());
        } else {
            System.out.println("La ecuación no tiene solución");
        }
        input.close();
    }
}