import java.util.Scanner;
public class LangostaAhumada{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int TOT;



    System.out.println("enter a number of persons: ");
    int NP = input.nextInt();


 if (NP > 300) {
    TOT= 75 * NP;
  } else if (NP  >= 200 && NP <= 300) {
    TOT = 85 * NP;
  } else {
    TOT= 95 * NP;
}

System.out.println("the total is: " + TOT);
}

}
