import java.util.Scanner;

public class HavaSicaklikEtkinlik {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sicaklik;
        System.out.println("Hava sıcaklığını giriniz:");
        sicaklik=scan.nextInt();
        if(sicaklik<5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if(sicaklik>5&&sicaklik<10) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if(sicaklik>10&&sicaklik<15) {
            System.out.println("Sinema ve Pikniğe gidebilirsiniz.");
        } else if(sicaklik>15&&sicaklik<25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else if(sicaklik>25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
