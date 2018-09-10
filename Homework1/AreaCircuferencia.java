import java.util.Scanner;
public class AreaCircuferencia{

public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  double area;
  double PI = 3.1416;
  System.out.println("ingrese el radio de la circuferencia");
        double R=input.nextDouble();

area= PI * R * R;
    System.out.println("su area es: " + area);

}
}
