import javax.swing.JOptionPane;
public class AlgoritmoDoctorJOpane{
  public static void main(String[] args) {
    double TOT;
    double CC;

    int NC = Integer.parseInt(JOptionPane.showInputDialog(null, "enter your query number: "));

 if (NC <= 3) {
    CC= 200;
    TOT= NC * CC;
  }else if (NC <= 5){
    CC = 150;
    TOT= (NC-3) * 150 + 600;
  }else if (NC <= 8){
    CC = 100;
    TOT = (NC-5) * 100 + 900;
  }else{
  CC=50;
  TOT= (NC-8) * 50 + 1200;
}

JOptionPane.showMessageDialog(null, "the price per Consult is: " + CC + "\n the treatment cost is : " + TOT);

   }
 }
