import javax.swing.JOptionPane;
public class AreaConstructoraJOpane{
public static void main(String[] args) {

  double area;
  double AT;
  double AR;
  double C;

double B = Double.parseDouble(JOptionPane.showInputDialog("ingrese la base de la figura"));
double A = Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura de la figura"));

//Altura del triangulo
        C= A/2;
//Area del triangulo
AT = (B * C)/2;
//Area del Rectangulo
AR = B * C;

area = AT + AR;
JOptionPane.showMessageDialog(null , "\n Su area es: " + area);

}
}
