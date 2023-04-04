import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Paranızı giriniz");
        int para=scan.nextInt();
        double kdvLiPara=0;
        double kdvTutari=0;

        if (para>0 && para<1000){
            kdvTutari=para*0.18;
            kdvLiPara= para+kdvTutari;

        } else if (para>=1000) {
            kdvTutari=para*0.8;
            kdvLiPara= para+kdvTutari;
        }else{
            System.out.println("Negatif değer giremezsiniz");
        }
        System.out.println("KDV'siz : "+para+"\n"+
       "KDV'li para : " + kdvLiPara+"\n"+
        "KDV Tutarı : "+ kdvTutari        );

    }
}
