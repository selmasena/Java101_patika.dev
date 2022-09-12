
import java.util.Scanner;

public class UcgeninAlaniniBulma {

    public static void main(String[] args) {

        int u, k1, k2, k3;
        //u=Çevrenin yarısı
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üçgenin alanını bulan program");
        System.out.print("Üçgenin 1.kenarını giriniz:");
        k1 = scanner.nextInt();
        System.out.print("Üçgenin 2.kenarını giriniz:");
        k2 = scanner.nextInt();
        System.out.print("Üçgenin 3.kenarını giriniz:");
        k3 = scanner.nextInt();
        u = (k1 + k2 + k3) / 2;
        System.out.println("Üçgenin alanı:" + Math.sqrt(u * (u - k1) * (u - k2) * (u - k3)));

    }
}
