import java.util.Scanner;
public class AreaRectangulo{

public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  double area;

  System.out.println("ingrese la altura del rectangulo");
        double A=input.nextDouble();
        System.out.println("ingrese la base del rectangulo");
        double B=input.nextDouble();

    area = A * B;
    System.out.println("su area es: " + area);

}
}
