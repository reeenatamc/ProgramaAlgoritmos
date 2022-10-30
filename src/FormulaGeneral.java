import java.util.Scanner;

public class FormulaGeneral {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para calcular la respuesta de una ecuación cuadrática por la Fórmula General");
        System.out.println("Dar el valor de a: ");
        double a = teclado.nextDouble();
        System.out.println("Dar el valor de b: ");
        double b = teclado.nextDouble();
        System.out.println("Dar el valor de c: ");
        double c = teclado.nextDouble();
        double x;
        double x1 = 0;
        double x2 = 0;
        x = (Math.pow(b,2))-4*a*c;

        if (x<0) {
            System.out.println("No válido");
        } else {
            x1 = (-b+Math.sqrt(x))/(2*a);
            x2 = (-b-Math.sqrt(x))/(2*a);
        }
        System.out.println("El valor de x1: "+x1);
        System.out.println("El valor de x2: "+x2);
    }
}
