import javax.swing.JOptionPane;
public class LangostaAhumadaJOpane{
public static void main(String[] args) {
int TOT;

int NP= Integer.parseInt(JOptionPane.showInputDialog(null, "enter a number of persons: "));



 if (NP > 300) {
    TOT= 75 * NP;
  } else if (NP  >= 200 && NP <= 300) {
    TOT = 85 * NP;
  } else {
    TOT= 95 * NP;
}

JOptionPane.showMessageDialog(null, "The total is: " + TOT);

}

}
