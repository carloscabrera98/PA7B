import javax.swing.JOptionPane;
public class SueldoSemanalJOpane{
public static void main(String[] args) {

  double SS;

double HT = Double.parseDouble(JOptionPane.showInputDialog("ingrese las horas trabajadas"));
double PH = Double.parseDouble(JOptionPane.showInputDialog("ingrese el pago por hora"));

SS = (HT * PH);

JOptionPane.showMessageDialog(null, "Su sueldo semanal es: "+ SS);


 }
}
