import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int gun;
        int ay;

        Scanner scan = new Scanner(System.in);

        System.out.print("Doğdunuz ayı giriniz: ");
        ay = scan.nextInt();

        System.out.print("Doğdunuz günü giriniz: ");
        gun = scan.nextInt();

        switch (ay){
            case 1:
                if(gun>=1 && gun<=31){
                    if(gun<22){
                        System.out.println("Oğlak burcusunuz.");
                    }else{
                        System.out.println("Kova burcusunuz.");
                    }
                }else{
                    System.out.println("Geçersiz gün değeri girdiniz.");
                }
                break;
            case 2:
                if(gun>=1 && gun<=28){
                    if(gun<20){
                        System.out.println("Kova burcusunuz.");
                    }else{
                        System.out.println("Balık burcusunuz.");
                    }
                }else {
                    System.out.println("Geçersiz gün değeri girdiniz.");
                }
                break;
            case 3:
                if(gun>=1 && gun<=31){
                    if(gun<21){
                        System.out.println("Balık burcusunuz.");
                    }else{
                        System.out.println("Koç burcunuz.");
                    }
                }else{
                    System.out.println("Geçersiz gün değeri girdiniz.");
                }
                break;
            case 4:
                if(gun>=1 && gun <=30){
                    if(gun<21){
                        System.out.println("Koç burcunuz.");
                    }else{
                        System.out.println("Boğa burcusunuz.");
                    }
                }else{
                    System.out.println("Geçersiz gün değeri girdiniz.");
                }
                break;
            case 5:
                if(gun>=1 && gun<=31){
                    if(gun<22){
                        System.out.println("Boğa burcusunuz.");
                    }else {
                        System.out.println("İkizler burcusunuz.");
                    }
                }else{
                    System.out.println("Geçersiz gün değeri girdiniz.");
                }
                break;
            case 6:
                if(gun>=1 && gun<=30){
                    if(gun<23){
                        System.out.println("İkizler burcusunuz.");
                    }else{
                        System.out.println("Yengeç burcusunuz.");
                    }
                }else{
                    System.out.println("Geçersiz gün değeri girdiniz.");
                }
                break;
            case 7:
                if(gun>=1 && gun<=31){
                    if(gun<23){
                        System.out.println("Yengeç burcusunuz.");
                    }else{
                        System.out.println("Aslan burcusunuz.");
                    }
                }else{
                    System.out.println("Geçersiz gün değeri girdiniz.");
                }
                break;
            case 8:
                if(gun>=1 && gun<=31){
                    if(gun<23){
                        System.out.println("Aslan burcusunuz");
                    }else {
                        System.out.println("Başak burcusunuz.");
                    }
                }else{
                    System.out.println("Geçersiz gün değeri girdiniz.");
                }
                break;
            case 9:
                if(gun>=1 && gun<=30){
                    if(gun<23){
                        System.out.println("Başak burcusunuz.");
                    }else{
                        System.out.println("Terazi burcusunuz.");
                    }
                }else {
                    System.out.println("Geçersiz gün değeri girdiniz.");
                }
                break;
            case 10:
                if(gun>=1 && gun<=31){
                    if(gun<23){
                        System.out.println("Terazi burcusunuz.");
                    }else{
                        System.out.println("Akrep burcusunuz.");
                    }
                }else{
                    System.out.println("Geçersiz gün değeri girdiniz.");
                }
                break;
            case 11:
                if(gun>=1 && gun<=30){
                    if(gun<22) {
                        System.out.println("Akrep burcusunuz.");
                    }else{
                        System.out.println("Yay burcusunuz.");
                    }
                }else {
                    System.out.println("Geçersiz gün değeri girdiniz.");
                }
                break;
            case 12:
                if(gun>=1 && gun<=31){
                    if(gun<22){
                        System.out.println("Yay burcusunuz.");
                    }else{
                        System.out.println("Oğlak burcusunuz.");
                    }
                }else{
                    System.out.println("Geçersiz gün değeri girdiniz.");
                }
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
                break;
        }
    }
}
