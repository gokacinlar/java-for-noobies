package Giris;
import java.util.Scanner;

public class kanverebilmeyihesaplayanprogram {
    public static void main(String[] args) {
        int minAge = 18, maxWeight = 100, userAge, userWeight;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Yaşınızı Giriniz: ");
        userAge = userInput.nextInt();
        System.out.print("Kilonuzu Giriniz: ");
        userWeight = userInput.nextInt();

        if (userAge < minAge) {
            System.out.println("Kan veremezsiniz.");
        } else if (userWeight > maxWeight) {
            System.out.println("Kan veremezsiniz.");
        } else {
            System.out.println("Kan verebilirsiniz.");
        }
    }
}