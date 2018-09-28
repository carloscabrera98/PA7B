import javax.swing.JOptionPane;
public class NumeroPositivoJOpane{
  public static void main(String[] args) {
    String R;
int NUM = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: "));

    if (  NUM > 0){
        R= "Positive";

    }else{
      R= "Negative";
}
JOptionPane.showMessageDialog(null, "The number is: " + R);
      }
}
