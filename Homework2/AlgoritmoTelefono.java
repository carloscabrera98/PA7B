import java.util.Scanner;
public class AlgoritmoTelefono{
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
final String DIA = "domingo";
final String TURN = "Matutino";
double PAG;
double IMP;
double TOT;

System.out.println("Enter your time: ");
int TI = input.nextInt();
Scanner DDH = new Scanner(System.in);
System.out.println("Enter the type of day: ");
String DI = DDH.nextLine();
Scanner MV = new Scanner(System.in);
System.out.println("Enter the turn of the day: ");
String  TU = MV.nextLine();

if (TI <= 5)
  PAG = TI * 1;
else if (TI <= 8)
  PAG= (TI - 5) * .80 + 5;
else if (TI <= 10)
  PAG= (TI - 8)* .70 + 7.4;
else{
  PAG= (TI - 10) * .50 + 8.8;
}

if (DI.equals(DIA))
      IMP= PAG* 0.03;
else if (TU.equals(TURN))
      IMP= PAG * 0.15;
    else {
      IMP= PAG * 0.10;

}
 TOT= PAG + IMP;


System.out.println("The pay is: " + PAG);
System.out.println("The tax is: " + IMP);
System.out.println("The total pay is: " + TOT);
}
}
