import java.util.Scanner;

public class CinZodiac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dogumYili;

        System.out.println("Doğum yılınızı girin");

        dogumYili = scan.nextInt();




        if (dogumYili>1) {

            if (dogumYili %12 == 0){
                System.out.println("Çin astrolojisine göre burcunuz Maymun");

            } else if (dogumYili %12 ==1) {
                System.out.println("Çin astrolojisine göre burcunuz Horoz");

            }else if (dogumYili %12 ==2) {
                System.out.println("Çin astrolojisine göre burcunuz Köpek");


            }else if (dogumYili %12 ==3) {
                System.out.println("Çin astrolojisine göre burcunuz Domuz");


            }else if (dogumYili %12 ==4) {
                System.out.println("Çin astrolojisine göre burcunuz Fare");


            }else if (dogumYili %12 ==5) {
                System.out.println("Çin astrolojisine göre burcunuz Öküz");


            }else if (dogumYili %12 ==6) {
                System.out.println("Çin astrolojisine göre burcunuz Kaplan");


            }else if (dogumYili %12 ==7) {
                System.out.println("Çin astrolojisine göre burcunuz Tavşan");


            }else if (dogumYili %12 ==8) {
                System.out.println("Çin astrolojisine göre burcunuz Ejderha");


            }else if (dogumYili %12 ==9) {
                System.out.println("Çin astrolojisine göre burcunuz Yılan");


            }else if (dogumYili %12 ==10) {
                System.out.println("Çin astrolojisine göre burcunuz At");


            }else if (dogumYili %12 ==11) {
                System.out.println("Çin astrolojisine göre burcunuz Koyun");


            }
        } else {
            System.out.println("Hatalı doğum yıl girişi \n 0+ sayı giriniz");
        }
    }
}
