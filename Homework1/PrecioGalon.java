import java.util.Scanner;
public class PrecioGalon{

public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  double TG;
  double GA;

  System.out.println("ingrese cantidad de litros que produce");
        double L=input.nextDouble();
        System.out.println("ingrese el precio del Galón");
        double PG=input.nextDouble();


    TG = (L / 3.785);
    GA = (PG *TG );

    System.out.println("su ganancia  total en el dia es : " + GA);

}
}
