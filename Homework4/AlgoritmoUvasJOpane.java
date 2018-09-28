import javax.swing.JOptionPane;
public class AlgoritmoUvasJOpane{
public static void main(String[] args) {
double GA;


final String A = "A";
final String B = "B";

String TI = JOptionPane.showInputDialog(null, "Enter the type of grape: ");
int TA = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the size of grape:  "));
double P= Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the price of grape: "));
int K = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the KG of production: "));

if (TI.equals(A)){
    if (TA== 1){
      P= P + 0.20;
    }else{
      P= P + 0.30;
}
} if (TI.equals(B)){
    if (TA== 1){
      P= P - 0.30;
    } else {
      P= P - 0.50;
}
}
 GA= P * K;
JOptionPane.showMessageDialog(null, "Your ganancy is : "+ GA);

  }
}
