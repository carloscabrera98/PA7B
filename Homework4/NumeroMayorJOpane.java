import javax.swing.JOptionPane;
public class NumeroMayorJOpane{
public static void main(String[] args) {
int M;

int A = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a  first number: "));
int B = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a  second number: "));

    if (  A > B) {
       M= A;

    }else{
        M= B;
}

JOptionPane.showMessageDialog(null, "The higher number is " + M);

}

}
