import javax.swing.JOptionPane;
public class  AreaTerrenoJOpane{
public static void main(String[] args) {

  double C, AT, AC, Area;


double R = Double.parseDouble(JOptionPane.showInputDialog("ingrese base del triangulo rectangulo y radio"));
double H = Double.parseDouble(JOptionPane.showInputDialog("ingrese la hipotenusa"));

C= Math.sqrt ((H*H) - (R*R));
AT= 2* (R*C)/2;
AC= (3.1416*R*R)/2;
Area= (AT + AC);


    JOptionPane.showMessageDialog(null , "Area del terreno: " + Area);

}
}
