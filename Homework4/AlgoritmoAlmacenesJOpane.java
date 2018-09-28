import javax.swing.JOptionPane;
public class AlgoritmoAlmacenesJOpane{
  public static void main(String[] args) {
  double DE;

  int CT = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a cost of suit: "));

    if (  CT >= 2500) {
      DE= CT * .15;

    }else{
        DE= CT * .08;
}
double PF= CT - DE;

JOptionPane.showMessageDialog(null, "Your discount is: " + DE + "\n The new cost of suit is : " + PF);
     }
   }
