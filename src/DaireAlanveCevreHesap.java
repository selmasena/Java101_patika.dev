
import java.util.Scanner;

public class DaireAlanveCevreHesap {

    public static void main(String[] args) {
        final double pi = 3.14;
        double cevre, alan;
        int r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dairenin alanın ve çevresini hesaplayan program");
        System.out.print("Dairenin yarıçapını giriniz:");
        r = scanner.nextInt();
        cevre = 2 * pi * r;
        alan = pi * r * r;
        System.out.println("Dairenin alanı:" + alan + "\n" + "Dairenin çevresi:" + cevre);
    }
}
