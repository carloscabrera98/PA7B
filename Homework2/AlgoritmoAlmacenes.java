import java.util.Scanner;
public class AlgoritmoAlmacenes{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double DE;

    System.out.println("Enter a cost of suit: ");
    int CT= input.nextInt();

    if (  CT >= 2500) {
      DE= CT * .15;

    }else{
        DE= CT * .08;
}
double PF= CT - DE;
System.out.println("Your discount is : " + DE);
System.out.println("The new cost of suit is : " + PF);
     }
   }
