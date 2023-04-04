import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        double a , b, c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci Kenarı Giriniz : ");
        a = scan.nextInt();
        System.out.print("İkinci Kenarı Giriniz : ");
        b = scan.nextInt();

        c = Math.sqrt((a*a) + (b*b)) ;
        System.out.println("Hipotenüs : " + c);
    }
}
