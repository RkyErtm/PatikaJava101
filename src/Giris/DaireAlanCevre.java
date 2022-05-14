package Giris;

import java.util.Scanner;

public class DaireAlanCevre {
    /*
    Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını
    ve çevresini hesaplayan programı yazın.
        Alan Formülü:pi*r*r;
        Çevre Formülü:2* pi*r;
     */
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        int r;
        final double pi=3.4;
        System.out.println("yarıçap giriniz:");
        r=inp.nextInt();
        double DaireAlan=(pi*r*r);
        double DaireCevre=(2*pi*r);
        System.out.println("Dairenin Alanı:"+DaireAlan);
        System.out.println("Dairenin Çevresi:"+DaireCevre);
    }
}
