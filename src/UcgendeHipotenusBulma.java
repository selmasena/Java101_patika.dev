
import java.util.Scanner;

public class UcgendeHipotenusBulma {

    public static void main(String[] args) {
        int k1, k2, k3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uçgende hipotenüs bulma programı");
        System.out.print("Üçgenin 1.dik kenarını giriniz:");
        k1 = scanner.nextInt();
        System.out.print("Üçgenin 2.dik kenarını giriniz:");
        k2 = scanner.nextInt();

        k3 =(int) (Math.sqrt(k1 * k1 + k2 * k2));
        System.out.println("Üçgenin hipotenüsü:" + k3);
    }

}
