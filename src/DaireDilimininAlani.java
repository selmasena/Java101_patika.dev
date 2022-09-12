
import java.util.Scanner;

public class DaireDilimininAlani {

    public static void main(String[] args) {
        final double pi = 3.14;
        double r, a, alan;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Daire diliminin alanını hesaplama");
        System.out.print("Dairenin yarıçapını giriniz:");
        r = scanner.nextInt();
        System.out.print("Daire dilimininin açısını giriniz:");
        a = scanner.nextInt();
        alan = (a * pi * r * r) / 360;
        System.out.println("Daire diliminin alanı:" + alan);

    }
}
