import java.util.Scanner;

public class SifreKontrol {
    public static void main(String[] args) {
        String kullaniciAdi, sifre,yeniSifre;
        int secim;
        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        kullaniciAdi = scan.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        sifre = scan.nextLine();

        if(kullaniciAdi.equals("patika") && sifre.equals("java123")){
            System.out.println("Giriş Başarılı...");
        } else if (kullaniciAdi.equals("patika") && !sifre.equals("java123")) {
            System.out.println("Hatali şifre\nDeğiştirmek için 1 istemiyorsanız 0 giriniz.");
            secim = scan.nextInt();
            switch (secim){
                case 0:
                    System.out.println("İşlemizniz sonlandırıldı.");
                    break;
                case 1:
                    System.out.print("Yeni şifrenizi giriniz: ");
                    yeniSifre = scan.next();
                    if(yeniSifre.equals(sifre) || yeniSifre.equals("java123")){
                        System.out.println("Şifreniz oluşturulmadı tekrar deneyiniz.");
                    }else{
                        System.out.println("Şifreniz başarıyla oluşturuldu.");
                    }
                    break;
            }
        }else{
            System.out.println("Kullıcı adı ve şifre hatalı.");
        }
    }
}
