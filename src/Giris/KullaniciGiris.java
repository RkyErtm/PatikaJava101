package Giris;

import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String userName,password;
        Scanner scan=new Scanner(System.in);


        int girisHakki=3;
        boolean check;

        for(int i=0;i<=girisHakki;i++){
            System.out.print("enter username: ");
            userName=scan.next();
            System.out.print("enter password:");
            password=scan.next();
            if (userName.equals("Rky")&&password.equals("123")){
                check=true;
                System.out.println("Tebrikler giriş yapıldı!");
                break;
            }
            else{
                System.out.println("Hatalı giriş...");
                    System.out.println("Şifreyi sıfırlamak istiyor musunuz?\n1-Evet\n2-Hayır");
                    int yanit=scan.nextInt();
                    if (yanit==1){
                        System.out.print("Yeni şifre oluşturun: ");
                        String newPass=scan.next();
                        if (newPass!=password){
                            System.out.println("Şifre oluşturuldu.");

                            check=true;
                            girisHakki--;
                            //break;
                        } else if (newPass==password) {
                            System.out.println("şifre oluşturulamadı.");
                        }
                    }
                    else{
                        System.out.println("çıkış yapılıyor...");
                        break;
                    }
                }
            }
        }
        /*
        if (userName.equals("Rky")&&password.equals("123")){
            check=true;
            System.out.println("Tebrikler giriş yapıldı!");
        }
        else{
            check=false;
            System.out.println("Hatalı giriş!");
            if(check=false){
                System.out.println("Şifre sıfırlansın mı?");

            }
        }*/
    }

