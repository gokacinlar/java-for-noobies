// Girilen sayıların asal olup olmadığını bulan program.
import java.util.Scanner;
public class AsalSayiProgrami {
    static boolean asalSayiBulucu (int sayi, int bolen) {
        if (bolen == 1) {
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        return asalSayiBulucu(sayi, bolen - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Herhangi bir sayı giriniz: ");
        int sayi = input.nextInt();

        if(sayi <= 1) {
            System.out.println(sayi + " sayısı, asal bir sayı değildir.");
        } else {
            if(asalSayiBulucu(sayi, sayi -1)) {
                System.out.println(sayi + " sayısı, asal bir sayıdır.");
            } else {
                System.out.println(sayi + " sayısı, asal bir sayı değildir.");
            }
        }
    }
}