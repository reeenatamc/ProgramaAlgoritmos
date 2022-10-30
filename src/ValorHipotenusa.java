import java.util.Scanner;

public class ValorHipotenusa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para calular el valor de la hipotenusa");
        System.out.println("Dar el valor del cateto a: ");
        double catetoa = teclado.nextDouble();
        System.out.println("Dar el valor del cateto b: ");
        double catetob = teclado.nextDouble();
        double exp = 2;
        double hipotenusa = Math.sqrt((Math.pow(catetoa, exp))+(Math.pow(catetob, exp)));
        System.out.println("El valor de la hipotenusa es: " + hipotenusa);

    }
}
