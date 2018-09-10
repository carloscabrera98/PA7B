import java.util.Scanner;
public class AreaConstructora{

public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  double area;
  double AT;
  double AR;
  double C;
  System.out.println("ingrese la base de la figura");
        double B=input.nextDouble();
  System.out.println("ingrese la altura de la figura");
        double A=input.nextDouble();
//Altura del triangulo
        C= A/2;
//Area del triangulo
AT = (B * C)/2;
//Area del Rectangulo
AR = B * C;

area = AT + AR;
    System.out.println("su area es: " + area);

}
}
