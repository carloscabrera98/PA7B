import javax.swing.JOptionPane;
public class AlgoritmoEscuelaJOpane{
public static void main(String[] args) {
double PA;

int NA = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number of students: "));

 if (NA >= 100) {
    PA= 65;
  } else if (NA  >= 50) {
    PA = 70;
  } else if (NA  >= 30) {
    PA = 95;
  }  else {
  PA=4000/NA;
}

double TOT= NA * PA;

JOptionPane.showMessageDialog(null, "the price per student: " + PA + "\n the total is: " + TOT);
 }
}
