import javax.swing.JOptionPane;
public class NumeroMayor3JOpane{
  public static void main(String[] args) {
    int M;

int A = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a first number: "));
int B = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a second number: "));
int C = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a third number: "));

 if (A > B && A > C) {
    M= A;
  } else if (B > A && B > C) {
    M= B;
  } else {
    M=C;
}

JOptionPane.showMessageDialog(null,"the higher number is: " + M);

}

}
