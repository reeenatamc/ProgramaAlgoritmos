import java.util.Scanner;

public class AreaCirunferencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para calcular el área de una Circunferencia");
        System.out.println("Dar el valor del radio: ");
        double radio = teclado.nextDouble();
        double exp = 2;
        double area = Math.PI*Math.pow(radio, exp);
        System.out.println("El area de la cirunferencia es: " + area);
    }
}
