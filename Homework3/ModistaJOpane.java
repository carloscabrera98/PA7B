import javax.swing.JOptionPane;
public class ModistaJOpane{
public static void main(String[] args) {

double PG;
double CM = Double.parseDouble(JOptionPane.showInputDialog("ingrese la cantidad de metros que requiere"));

PG = (CM / 0.0254);

JOptionPane.showMessageDialog(null, "Pulgadas que debe pedir: " + PG);


}
}
