import javax.swing.JOptionPane;

public class FactorialWhileLoop{
public static void main(String[] args) {
  //NUMERO PARA EL LIMITE
  int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an int value"));

//NUMERO DEL FACTORIAL
int fact = 1;

//SENTINELA
int i= 1;
  while(i <=  value){
  fact = fact * i;
  i++;
  }
JOptionPane.showMessageDialog(null, "el factorial de " + value + " es " + fact, "Calcular factorial", JOptionPane.WARNING_MESSAGE);
  }
}
