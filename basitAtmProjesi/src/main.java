import java.util.Scanner;

public class ATMProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String clientName, password;
        int passRight = 3;
        int balance = 1500;
        int select, clientDeposit, clientWithdrawal;

        while (passRight > 0) {
            System.out.print("Kullanıcı Adınızı Giriniz: ");
            clientName = input.nextLine();
            System.out.print("Parolanızı Giriniz: ");
            password = input.nextLine();
            if (clientName.equals("UserName") && password.equals("abc123")) {
                System.out.println("Hoşgeldiniz sayın, " + clientName);
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    System.out.println("1. Para yatırma\n"
                            + "2. Para çekme\n"
                            + "3. Bakiye sorgulama\n"
                            + "4. Çıkış yap");
                    System.out.print("İşlem: ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Ne kadar yatırmak istiyorsunuz? ");
                        clientDeposit = input.nextInt();
                        if (clientDeposit <= 0) {
                            System.out.println("Bakiye para yatırmak için yetersiz, lütfen tekrar deneyin.");
                            break;
                        } else {
                            System.out.println("Başarıyla " + clientDeposit + " yatırdınız.");
                            clientDeposit += balance;
                            System.out.println("Mevcut miktar: " + clientDeposit);
                        }
                    } else if (select == 2) {
                        System.out.print("Ne kadar çekmek istiyorsunuz? ");
                        clientWithdrawal = input.nextInt();
                        if (clientWithdrawal > balance) {
                            System.out.println("Bakiye çekim için yetersiz, lütfen tekrar deneyin.");
                            break;
                        } else {
                            System.out.println("Başarıyla " + clientWithdrawal + " çektiniz.");
                            balance -= clientWithdrawal;
                            System.out.println("Kalan tutar: " + balance);
                        }
                        System.out.println("Başarıyla " + clientWithdrawal + " çektiniz.");
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz: " + balance);
                    }
                } while (select != 4);
                break;
            } else {
                passRight--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Lütfen tekrar deneyiniz.");
                if (passRight == 0) {
                    System.out.println("Hesabınız bloke olmuştur.");
                } else {
                    System.out.println("Kalan hakkınız: " + passRight);
                }
            }
        }
    }
}