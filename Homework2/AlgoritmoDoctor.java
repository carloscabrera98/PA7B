import java.util.Scanner;
public class AlgoritmoDoctor{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double TOT;
    double CC;
    System.out.println("enter your query number: ");
    int NC = input.nextInt();

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

System.out.println("the price per Consult is: " + CC);
System.out.println("the treatment cost is : " + TOT);
   }
 }
