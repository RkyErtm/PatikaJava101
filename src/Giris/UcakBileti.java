package Giris;

import java.util.Scanner;
/*
            Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
            Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.+
            Mesafe başına ücret 0,10 TL / km olarak alın.+
            İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

            Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
            Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.+
            Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.+
            Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.+
            Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.+
            Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
     */
public class UcakBileti {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int mesafe=0,yas,tipi;
        double normaltutar=0;

        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe=scan.nextInt();

        if (mesafe>0){
            normaltutar=mesafe*0.1;
        }
        else{
            System.out.println("Geçersiz değer girdiniz.");

        }

        System.out.print("Yaşınızı giriniz:");
        yas=scan.nextInt();

        if (yas<0){
            System.out.println("negatif değer giremezsiniz.");
        }
        else{
            if (yas<12&&yas>0){
                normaltutar -=(normaltutar/100)*50;
            }
            else if (yas<=24&&yas>=12)
            {
                normaltutar-=(normaltutar/100)*10;
            }
            else if (yas>65)
            {
                normaltutar-=(normaltutar/100)*30;
            }
        }

        System.out.println("Yolculuk Türü seçiniz:\n1-Tek Yönlü\n2-Gidiş-Dönüş");
        tipi=scan.nextInt();

        if ((tipi==1) || (tipi==2)){
            if (tipi==2){
                normaltutar-=(normaltutar/100)*20;
                normaltutar*=2;
            }

        }
        else{
            System.out.println("sadece 1 veya 2 değerini girebilirsiniz.");
        }

        System.out.println("TOPLAM TUTAR: "+normaltutar);


    }
}
