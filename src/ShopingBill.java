
import java.text.DecimalFormat;
import java.util.Scanner;

public class ShopingBill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Shoping Bill Calculator");
        double pear = 2.14, apple = 3.67, tomatoes = 1.11, banana = 0.95, aubergine = 5.00, bill = 0, total = 0;
        String name;
        int number;

        System.out.println("Products and Price:\nApple=3.67\nTomatoes=1.11\nPear=2.14\nBanana=0.95\nAubergine=5.00");
        System.out.print("How many kinds of products will you get?");
        number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.print("Enter the name of the product you are going to buy:");
            name = scanner.next().toLowerCase();
            System.out.print("Enter the kilos of " + name.toLowerCase() + " you wish to buy:");
            double kilos = scanner.nextDouble();

            switch (name) {
                case "pear":
                    bill = pear * kilos;
                    total += bill;
                    break;
                case "apple":
                    bill = apple * kilos;
                    total += bill;
                    break;
                case "tomatoes":
                    bill = tomatoes * kilos;
                    total += bill;
                    break;
                case "banana":
                    bill = banana * kilos;
                    total += bill;
                    break;
                default:
                    bill = aubergine * kilos;
                    total += bill;
                    break;
            }

        }
        DecimalFormat df = new DecimalFormat("##.##");
        String formatotal = df.format(total);
        System.out.print(("Total price: " + formatotal));
    }

}
