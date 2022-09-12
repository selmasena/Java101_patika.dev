
import java.util.Scanner;

public class NotOrtalamasıHesaplama {

    public static void main(String[] args) {

        int mat, fiz, kim, tur, tar, muz;

        Scanner tarayıcı = new Scanner(System.in);
        System.out.println("Not ortalaması hesaplama programı:");
        System.out.print("Matematik notunuzu giriniz:");
        mat = tarayıcı.nextInt();
        System.out.print("Fizik notunuzu giriniz:");
        fiz = tarayıcı.nextInt();
        System.out.print("Kimya notunuzu giriniz:");
        kim = tarayıcı.nextInt();
        System.out.print("Türkçe notunuzu giriniz:");
        tur = tarayıcı.nextInt();
        System.out.print("Tarih notunuzu giriniz:");
        tar = tarayıcı.nextInt();
        System.out.print("Müzik notunuzu giriniz:");
        muz = tarayıcı.nextInt();

        int sonuc = (mat + fiz + kim + tur + tar + muz) / 6;
        System.out.println("Not ortalamanız:" + sonuc);

        System.out.print((sonuc < 60) ? ("Sınıfta kaldı") : ("Sınıfı geçti"));

    }
}
