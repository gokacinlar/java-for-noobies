import java.util.Scanner;

public class UcakBiletiHesaplayanProgram {
    public static void main(String[] args) {

        /*
         * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
         * yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya
         * "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
         * Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
         * Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
         * Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
         * Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20
         * indirim uygulanır.
         */

        Scanner clientInput = new Scanner(System.in);
        int clientAge, clientKm, clientFlyingType;
        double totalPrice, ageDiscount, discountedPrice, roundTripDiscount;
        double defaultPricePerKm = 0.10D;
        double roundTripDiscountRate = 0.20D;
        double ageDiscountRate;

        System.out.print("Yaşınızı Giriniz (Örn: 18)= ");
        clientAge = clientInput.nextInt();

        System.out.print("Mesafeyi KM Cinsinden Giriniz (Örn: 1200)= ");
        clientKm = clientInput.nextInt();

        System.out.print("Yolculuk Türünü Seçiniz (1 = Tek Yön | 2 = Gidiş-Dönüş)= ");
        clientFlyingType = clientInput.nextInt();

        totalPrice = defaultPricePerKm * clientKm;

        if (clientKm <= 0 || clientAge <= 0 || (clientFlyingType != 1 && clientFlyingType != 2)) {
            System.out.println("Hatalı veri girdiniz, lütfen tekrar deneyin.");
            return;
        }

        if (clientAge <= 12) {
            ageDiscountRate = .050D;
            ageDiscount = totalPrice * ageDiscountRate;
            discountedPrice = totalPrice - ageDiscount;
        } else if ((clientAge >= 12) && (clientAge <= 24)) {
            ageDiscountRate = 0.10D;
            ageDiscount = totalPrice * ageDiscountRate;
            discountedPrice = totalPrice - ageDiscount;
        } else if (clientAge >= 65) {
            ageDiscountRate = 0.30D;
            ageDiscount = totalPrice * ageDiscountRate;
            discountedPrice = totalPrice - ageDiscount;
        } else {
            discountedPrice = totalPrice;
        }

        if (clientFlyingType == 2) {
            roundTripDiscount = discountedPrice * roundTripDiscountRate;
            discountedPrice -= roundTripDiscount;
        }

        System.out.println("Toplam tutarınız: " + discountedPrice + " TL'dir.");
    }
}