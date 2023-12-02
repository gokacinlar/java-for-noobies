import java.util.Scan

public class main {
    public static void main(String[] args) {
        double kdv = 18, fiyat, result;
        Scanner input = new Scanner(System.in);
        System.out.println("KDV = 18%");
        System.out.print("KDV'si hesaplanacak ürününün fiyatı giriniz (Örnek = 185,45): ");
        fiyat = input.nextDouble();
        result = fiyat * (1 + kdv/100);
        System.out.println("KDV's i z tutar: " + fiyat);
        System.out.println("%18 KDV'li tutar: " + result);

        /*
                Tutar Hesaplama Şu şekilde de yapılabilir:

                double kdv = 0.18, fiyat, kdvTutarı, result;
                kdvTutari = fiyat * kdv;
                result = kdvTutari + fiyat;

         */
}
