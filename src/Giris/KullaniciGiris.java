package Giris;

import java.util.Scanner;

public class KullaniciGiris {
        /*
              -KullaniciAdi ve Şifre Belirle.
              -3 hakkı var.
              -Yanlış girdiği sürece hak azalacak.
              -Doğru girince başrarılı mesaşı gelecek.
         */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userName="Rky",password="123";

        int tryy=3,stry=3;
        for (int i = 0; i < tryy ; i++) {

            System.out.print("enter username:");
            String n=scan.next();
            System.out.print("enter password:");

            String p=scan.next();

            if (n.equals(userName)&&p.equals(password)){
                System.out.println("Tebrikler giriş yaptınız.");
                break;
            }
            else{
                System.out.println("Hatalı Giriş");
                stry--;
                System.out.println("kalan hakkınız: "+stry);
            }
            if (i==3){
                System.out.println("giriş hakkınız bitmiştir.");
                System.out.println("kalan giriş hakkınız: "+stry);
                System.out.println("Çıkış yapılıyor...");
                break;
            }
        }   //Kalan hakkı tryy'da azaltınca döngüyüde azaltmış oluyorum. başka türlü nasıl gösteririm bilemedim.
    }
}

