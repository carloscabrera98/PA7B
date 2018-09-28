import javax.swing.JOptionPane;
public class BancoLimiteJOpane{
public static void main(String[] args) {
double AC;

int TT = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your type of card: "));
double LA= Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your current credit limit: "));


if (TT == 1)
 AC= LA * 0.25;
else if (TT== 2)
AC= LA * 0.35;
else if (TT == 3)
AC= LA * 0.40;
else
AC= LA* 0.50;

double NC= LA + AC;

JOptionPane.showMessageDialog(null, "Your credit increase is: "+ AC + "\n Your new credit limit is: " + NC);



  }
}
