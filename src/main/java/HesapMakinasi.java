import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz:");
        double a = scan.nextDouble();
        System.out.println("2.sayıyı giriniz:");
        double b = scan.nextDouble();
        System.out.println("İşlemi seçiniz: ");
        System.out.println("İşlem: +,-,*,/ ");
        char islem = scan.next().charAt(0);
        double sonuc=0;

        switch (islem){
            case '+':
                sonuc=a+b;
                break;
            case '-':
                sonuc=a-b;
                break;
            case '*':
                sonuc=a*b;
                break;
            case '/':
                sonuc=a/b;
                break;
        }

        System.out.println("Sonuc: " + sonuc );

    }
    }
