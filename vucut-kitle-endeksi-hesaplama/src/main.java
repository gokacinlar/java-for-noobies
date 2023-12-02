import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double kilo, boy;
        Scanner input = new Scanner(System.in);
        System.out.println("Vücut Kitle Endeksinizi Hesaplayın");
        System.out.print("Kilonuzu Giriniz: ");
        kilo = input.nextDouble();
        System.out.print("Boyunuzu Giriniz (Örnek: 1,75): ");
        boy = input.nextDouble();
        double result = kilo / (boy * boy);
        System.out.println("Vücut Kitle Endeksiniz: " + result);
    }
}