
import java.util.Scanner;

public class KdvTutariHesaplama {

    public static void main(String[] args) {

        double fiyat, kdv, yenikdv;
        Scanner scanner = new Scanner(System.in);
        System.out.println("KDV tutarı hesaplama programı");
        System.out.print("Ürünün fiyatını giriniz:");

        fiyat = scanner.nextInt();
        if (0 <= fiyat && fiyat <= 1000) {
            kdv = (fiyat * 0.18) + fiyat;
            System.out.print("KDV'siz fiyat:" + fiyat + "\n" + "KDV'li fiyat:" + kdv + "\n" + "KDV oranı:0.18");

        } else if (fiyat > 1000) {
            yenikdv = (fiyat * 0.08) + fiyat;
            System.out.print("KDV'siz fiyat:" + fiyat + "\n" + "KDV'li fiyat:" + yenikdv + "\n" + "KDV oranı:0.08");

        }

    }
}
