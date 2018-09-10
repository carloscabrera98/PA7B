import java.util.Scanner;
public class Modista{

public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  double PG;

  System.out.println("ingrese la cantidad de metros que requiere");
        double CM=input.nextDouble();


PG = (CM / 0.0254);

    System.out.println("Pulgadas que debe pedir " + PG);

}
}
