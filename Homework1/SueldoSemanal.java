import java.util.Scanner;
public class SueldoSemanal{

public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  double SS;

  System.out.println("ingrese las horas trabajadas");
        double HT=input.nextDouble();
  System.out.println("ingrese el pago por hora");
       double PH=input.nextDouble();

SS = (HT * PH);

    System.out.println("su sueldo semanal es : " + SS);

}
}
