import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int math, physics, turkish, history, musics;
        Scanner input = new Scanner(System.in);
        System.out.println("Aritmetik Not Ortalamanızı Hesaplamak İçin Lütfen Notlarınızı Giriniz");
        System.out.print("Matematik Notunuz: ");
        math = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        physics = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkish = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        history = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        musics = input.nextInt();

        int calc = (math + physics + turkish + history + musics);
        double result = calc / 5.0;
        System.out.println("Ortalamanız: " + result);
    }
}
