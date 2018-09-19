  |import java.util.Scanner;
public class ComputeBMI{
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  final double KILOGRAMS_PER_POUND = 0.4535923;
  final double METER_PER_INCH = 0.0254;


System.out.println("Enter weight in pounds: ");
double weight = input.nextDouble();
System.out.println("Enter height in inches: ");
double height = input.nextDouble();

double weighInKilograms = weight * KILOGRAMS_PER_POUND;
double heightInMeters = height * METER_PER_INCH ;

double BMI = (weighInKilograms/ (heightInMeters*heightInMeters));
System.out.println("your BMI is: " + BMI);

if (BMI < 16)
  System.out.println("you are seriously underweight");
else if (BMI < 18)
  System.out.println("you are underweight");
else if (BMI < 24)
  System.out.println("you are normal weight");
else if (BMI < 29)
  System.out.println("you are overweight");
else if (BMI < 35)
  System.out.println("you are seriously overweight");
else
  System.out.println("you are gravely underweight");

  }
}
