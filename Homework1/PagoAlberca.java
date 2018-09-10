import java.util.Scanner;
public class  PagoAlberca{

public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  double V;
  double PAG;

  System.out.println("ingrese altura de la alberca");
        double A=input.nextDouble();
  System.out.println("ingrese el largo de la alberca");
        double L=input.nextDouble();
  System.out.println("ingrese el ancho de la alberca");
        double N=input.nextDouble();
  System.out.println("ingrese costo por metro cúbico");
        double CM=input.nextDouble();


V = (A*L*N);
PAG = (V* CM);


    System.out.println("Pago por realizar: " + PAG);

}
}
