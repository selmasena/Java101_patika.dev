
import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double weight,height,bmi;
        System.out.println("BMI Calculator");
        System.out.print("Input weight in kilogram:");
        weight=scanner.nextDouble();
        System.out.print("Input height in meters:");
        height=scanner.nextDouble();
        
        bmi=weight/(height*height);
        
        System.out.print("The Body Mass Index (BMI) is "+bmi);
        
        
    }
}
