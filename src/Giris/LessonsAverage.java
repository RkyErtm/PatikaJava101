package Giris;

import java.util.Scanner;

public class LessonsAverage {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;
        int sayac=0;
        int toplam=0;
        double average=0;

        System.out.println("Matematik notunuz:");
        mat=scan.nextInt();
        if (mat>0&&mat<=100){
            sayac++;
            toplam+=mat;
        }
        else{
            System.out.println("Geçersiz değer.");
        }
        System.out.println("Fizik notunuz:");
        fizik=scan.nextInt();
        if (fizik>0&&fizik<100){
            sayac++;
            toplam+=fizik;
        }
        else{
            System.out.println("Geçersiz değer.");
        }
        System.out.println("Turkce notunuz:");
        turkce=scan.nextInt();
        if (turkce>0&&turkce<100){
            sayac++;
            toplam+=turkce;
        }
        else{
            System.out.println("Geçersiz değer.");
        }
        System.out.println("Kimya notunuz:");
        kimya=scan.nextInt();
        if (kimya>0&&kimya<100){
            sayac++;
            toplam+=kimya;
        }
        else{
            System.out.println("Geçersiz değer.");
        }
        System.out.println("Müzik notunuz:");
        muzik=scan.nextInt();
        if (muzik>0&&muzik<100){
            sayac++;
            toplam+=muzik;
        }
        else{
            System.out.println("Geçersiz değer.");
        }

        average=toplam/sayac;
        System.out.println("ortalamanız: "+average);
        if (average>=55){
            System.out.println("Tebrikler GEÇTİNİZ.");
        }
        else{
            System.out.println("KALDINIZ.");
        }



    }
}
