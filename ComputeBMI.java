import java.util.Scanner;
public class ComputeBMI{
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  final double KILOGRAMS_PER_POUND = 0.4535923;
  final double METER_PER_INCH = 0.0254;
  double BMI;

System.out.println("Enter weight in pounds: ");
double weight = input.nextDouble();
System.out.println("Enter height in inches: ");
double height = input.nextDouble();

double weighInKilograms = weight * KILOGRAMS_PER_POUND;
double heightInMeters = height * METER_PER_INCH ;

BMI = (weighInKilograms/ (heightInMeters*heightInMeters));

System.out.println("Your IBM is: " + BMI);

  }
}
