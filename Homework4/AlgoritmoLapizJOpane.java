import javax.swing.JOptionPane;
public class AlgoritmoLapizJOpane{
  public static void main(String[] args) {
    double PAG;

int X = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number of pencils: "));

    if (  X >= 1000) {
      PAG= X * (.85);

    }else{
        PAG= X* .90;
}
JOptionPane.showMessageDialog(null, "the pay is: " + PAG);

     }
   }
