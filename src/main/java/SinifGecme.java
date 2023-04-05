import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int  mat;
        int fizik;
        int kimya;
        int turkce;
        int beden;
        int toplamDers = 0;
        int toplam = 0;
        double ort;

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = scan.nextInt();
        if(mat <= 100 && mat >= 0){
            toplam +=mat;
            toplamDers++;
        }else
            System.out.println("Girdiğiniz değer 0 ile 100 arasında olmalı!");

        System.out.print("Fizik Notunuz: ");
        fizik = scan.nextInt();
        if(fizik <= 100 && fizik >= 0){
            toplam +=fizik;
            toplamDers++;
        }else
            System.out.println("Girdiğiniz değer 0 ile 100 arasında olmalı!");

        System.out.print("Kimya Notunuz: ");
        kimya = scan.nextInt();
        if(kimya <= 100 && kimya >= 0){
            toplam +=kimya;
            toplamDers++;
        }else
            System.out.println("Girdiğiniz değer 0 ile 100 arasında olmalı!");

        System.out.print("Türkce Notunuz: ");
        turkce = scan.nextInt();
        if(turkce <= 100 && turkce >= 0){
            toplam +=turkce;
            toplamDers++;
        }else
            System.out.println("Girdiğiniz değer 0 ile 100 arasında olmalı!");

        System.out.print("Beden Notunuz: ");
        beden = scan.nextInt();
        if(beden <= 100 && beden >= 0){
            toplam +=beden;
            toplamDers++;
        }else
            System.out.println("Girdiğiniz değer  0 ile 100 arasında olmalı!");

        if(toplamDers == 0)
            ort = 0;
        else
            ort = toplam /toplamDers;

        System.out.println("Ortalamanız: " + ort);

        if(ort<=55){
            System.out.println("Kaldınız,seneye tekrar görüşürüz!");
        }else {
            System.out.println("Tebrikler geçtiniz.");
        }
    }
}
