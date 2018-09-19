import java.util.Scanner;
public class AlgoritmoLapiz{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double PAG;


    System.out.println("Enter a number of pencils: ");
    int X= input.nextInt();


    if (  X >= 1000)
      PAG= X * (.85);

    else
        PAG= X* .90;


System.out.println("the pay is: " + PAG);
     }
   }
