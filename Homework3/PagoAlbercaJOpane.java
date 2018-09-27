import javax.swing.JOptionPane;
public class  PagoAlbercaJOpane{
public static void main(String[] args) {

  double V;
  double PAG;

double A = Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura de la alberca"));
double L = Double.parseDouble(JOptionPane.showInputDialog("ingrese el largo de la alberca"));
double N = Double.parseDouble(JOptionPane.showInputDialog("ingrese el ancho de la alberca"));
double CM = Double.parseDouble(JOptionPane.showInputDialog("ingrese el costo por metro cubico"));

V = (A*L*N);
PAG = (V* CM);


JOptionPane.showMessageDialog(null, "Pago por realizar: " + PAG);

  }
}
