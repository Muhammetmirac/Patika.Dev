import java.util.Scanner;

public class NotOrtalamasi {

    /*
    Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve
ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana
"Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz:");
        double mat = scan.nextDouble();
        System.out.print("Fizik notunuzu giriniz:");
        double fizik = scan.nextDouble();
           System.out.print("Kimya notunuzu giriniz:");
        double kimya = scan.nextDouble();
           System.out.print("Türkçe notunuzu giriniz:");
        double turkce = scan.nextDouble();
          System.out.print("Tarih notunuzu giriniz:");
        double tarih = scan.nextDouble();
          System.out.print("Müzik notunuzu giriniz:");
        double muzik = scan.nextDouble();

        double ort = (mat+fizik+kimya+tarih+turkce+muzik)/6;
     String sonuc= ort>=60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(ort + " ortalama ile " + sonuc);

    }
}
