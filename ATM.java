import java.util.Scanner;
public class ATM {

    public void calis(Hesap hesap) {

        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        int giris_hakki = 3;

        while(true) {

            if (login.login(hesap)) {
                System.out.println("Giriş Başarılı...");
                break;

            }
            else {
                System.out.println("Giriş Başarısız...");
                giris_hakki -= 1;
                System.out.println("Kalan Giriş Hakkı: " + giris_hakki);
            }
            if (giris_hakki == 0) {
                System.out.println("3 kez hatalı giriş denemesi yaptınız. Giriş hakkınız bitmiştir...");

                return;
            }

        }

        System.out.println("***************************************************************************");
        String islemler = "1. Bakiye Görüntüleme\n"
                            +"2. Para Yatırma\n"
                            +"3. Para Çekme\n"
                            "Çıkış için q'ya basınız";
        System.out.println(islemler);
        System.out.println("***************************************************************************");

        while (true) {

            System.out.println("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Çıkış Yapılıyor...");
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz : " + hesap.getBakiye());
            }
            else if (islem.equals("2")) {

                System.out.println("Yatırmak İstediğiniz Tutarı Giriniz : " );
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            }
            else if (islem.equals("3")) {
                System.out.println("Çekmek İstediğiniz Tutarı Giriniz");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }





        }




    }

}
