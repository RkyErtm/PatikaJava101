package Giris;

import java.util.Scanner;

public class HesapMakinesi {
    //Java koşullu ifadeler ile basit hesap makinesi yapımı
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number1:");
        int n1 = scan.nextInt();
        System.out.print("enter number2:");
        int n2 = scan.nextInt();

        System.out.println("İşlem Seçiniz:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        int secim = scan.nextInt();

        try {
            switch (secim) {
                case 1:
                    System.out.println("Toplam: " + (n1 + n2));
                    break;
                case 2:
                    if (n1 > n2) {
                        System.out.println("çıkarma: " + (n1 - n2));
                    } else {
                        System.out.println("Çıkarma: " + (n2 - n1));
                    }
                    break;
                case 3:
                    System.out.println("Çarpım: " + (n1 * n2));
                    break;
                case 4:
                    if (n1 > n2) {
                        System.out.println("Bölme: " + (n1 / n2));
                    } else if (n2 > n1) {
                        System.out.println("Bölme: " + (n2 / n1));
                    } else if (n1 == 0 || n2 == 0) {
                        System.out.println("Sıfıra bölünemez");
                    }
                    break;
                    
            }
            if (secim < 0 || secim > 4) {
                System.out.println("Geçerli bir değer giriniz.");
            }

        } catch (ArithmeticException a) {
            System.out.println("sıfıra bölünme hatası.");
            System.out.println(a.getMessage());
        }



    }
}
