import javax.swing.JOptionPane;
public class AreaRectanguloJOpane{
public static void main(String[] args) {

  double area;

  double A = Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura del rectangulo"));
  double B = Double.parseDouble(JOptionPane.showInputDialog("ingrese la base del rectangulo"));

  area = A * B;
  JOptionPane.showMessageDialog(null , "\n su area es:  " + area);

}
}
