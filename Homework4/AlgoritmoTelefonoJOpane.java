import javax.swing.JOptionPane;
public class AlgoritmoTelefonoJOpane{
public static void main(String[] args) {
final String DIA = "domingo";
final String TURN = "Matutino";
double PAG;
double IMP;
double TOT;

int TI = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your time: "));

String DI = JOptionPane.showInputDialog(null, "Enter the type of day: ");

String TU = JOptionPane.showInputDialog(null, "Enter the turn of the day ");

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

JOptionPane.showMessageDialog(null,"The pay is: " + PAG + "\n The tax is: " + IMP + "\n The total pay is: " + TOT);

}
}
