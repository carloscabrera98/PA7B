import java.util.Scanner;
public class  AreaTerreno{

public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  double C, AT, AC, Area;


  System.out.println("ingrese base del triangulo rectangulo y radio");
        double R=input.nextDouble();
  System.out.println("ingrese la hipotenusa");
        double H=input.nextDouble();

C= SQTR ((H*H) - (R*R));
AT= 2* (R*C)/2;
AC= (3.1416*R*R)/2;
Area= (AT + AC);


    System.out.println("Area del terreno: " + Area);

}
}
