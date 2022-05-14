package Giris;

import java.util.Scanner;

public class VucutKitleIndexi {
    /*
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının
        "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        Formül
        Kilo (kg) / Boy(m) * Boy(m)
         */
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Boyunuzu giriniz: ");
        double boy=inp.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        int kilo=inp.nextInt();
        double index=kilo/(boy*boy);

        System.out.println("boy:"+boy);
        System.out.println("kilo:"+kilo);
        System.out.println("Vücut kitle indexiniz: "+index);
    }
}
