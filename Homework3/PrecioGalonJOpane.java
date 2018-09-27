import javax.swing.JOptionPane;
public class PrecioGalonJOpane{
public static void main(String[] args) {

  double TG;
  double GA;

double L = Double.parseDouble(JOptionPane.showInputDialog("ingrese cantidad de litros que produce"));
double PG = Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio del galon"));

    TG = (L / 3.785);
    GA = (PG *TG );

  JOptionPane.showMessageDialog(null, "su ganancia  total en el dia es : " + GA);

  }
}
