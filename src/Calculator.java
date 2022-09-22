
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        float n1,n2; 
        String select;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the first number:");
        n1=scanner.nextFloat();
        System.out.print("Enter the second number:");
        n2=scanner.nextFloat();
        
        System.out.println("Select the action you want to do:\nx,/,+,-");
        select=scanner.next().toLowerCase();
        switch (select) {
            case "x" -> {
                System.out.println(n1+"*"+n2+"="+(n1*n2));
                break;
            }
            case "/" -> {
                System.out.println(n1+"/"+n2+"="+(n1/n2));
                break;
                
            }
            case "+" -> {
                System.out.println(n1+"+"+n2+"="+(n1+n2));
                break;
            }
            case "-" -> {
                System.out.println(n1+"-"+n2+"="+(n1-n2));
                break;
            }
          
        }
    }
}
