public class Main {

    public static void main(String[] args) {

        /*

        Object Oriented (Nesne Yönelimli) ATM Projesi

        Login Class - Kullanıcı Giriş Kontrolü

        Hesap Class - Hesap İşlemleri

        ATM - ATMyi çalıştıracak.

        */

        ATM atm = new ATM();

        Hesap hesap = new Hesap("Direncan Gider", "12345", 2000);

        atm.calis(hesap);
        System.out.println("Programdan Çıkılıyor...");

    }

}
