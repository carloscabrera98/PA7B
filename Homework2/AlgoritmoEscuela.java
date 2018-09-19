import java.util.Scanner;
public class AlgoritmoEscuela{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double PA;



    System.out.println("enter a number of students: ");
    int NA = input.nextInt();


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

System.out.println("the price per student: " + PA);
System.out.println("the total is: " + TOT);
}

}
