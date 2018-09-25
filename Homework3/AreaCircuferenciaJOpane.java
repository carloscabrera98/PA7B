import javax.swing.JOptionPane;
public class  AreaCircuferenciaJOpane{
public static void main(String[] args) {

  double area;
  double PI = 3.1416;
  double R = Double.parseDouble(JOptionPane.showInputDialog("ingrese el radio de la circuferencia?"));

area= PI * R * R;
  JOptionPane.showMessageDialog(null , "\n El area de la circuferencia es: " + area);

}
}
