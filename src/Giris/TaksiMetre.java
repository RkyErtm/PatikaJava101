package Giris;

import java.util.Scanner;

public class TaksiMetre {
    /*
    TAKSİMETRE PROGRAMI
    -taksimetre km başına 2.20 TL tutmaktadır.
    -Min ödenecek tutar 20 TLdir. '= tl altındaki ücretlerde yine 20 tl alınacaktır.
    -taksimetre açılış ücreti 10 tldir.
     */
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int km;
        double perKm=2.20,total,startPrice=10;

        System.out.println("Mesafeyi KM cinsinden giriniz?");
        km =scanner.nextInt();
        total =(km*perKm);
        total+=startPrice;
        total = (total<20) ? 20: total;
        System.out.println("toplam Tutar:"+total);



    }
}
