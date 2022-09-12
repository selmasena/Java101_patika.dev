
import java.util.Scanner;

public class TaksimetreHesaplama {

    public static void main(String[] args) {
//Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
//
//Taksimetre KM başına 2.20 TL tutmaktadır.
//Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
//Taksimetre açılış ücreti 10 TL'dir.
        int km;
        double perKm = 2.20;
        int min = 20;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taksimetre hesaplama programı");
        System.out.print("Gidilen kilometreyi giriniz:");
        km = scanner.nextInt();
        double tutar = (km * perKm) + 10;
        if (tutar <= 20) {
            System.out.println("Ücret=20TL");
        } else {
            System.out.println("Ücret=" + tutar+"TL");
        }

    }
}
