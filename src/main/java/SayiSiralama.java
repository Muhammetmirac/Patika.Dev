import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        int sayi1, sayi2, sayi3;

        Scanner sca = new Scanner(System.in);
        System.out.println("sayi1 'i giriniz: ");
        sayi1 = sca.nextInt();
        System.out.println(sayi1);

        System.out.println("sayi2 'i giriniz: ");
        sayi2 = sca.nextInt();
        System.out.println(sayi2);

        System.out.println("sayi3 'ü  giriniz: ");
        sayi3 = sca.nextInt();
        System.out.println(sayi3);

        if ((sayi1 < sayi2) && (sayi1 < sayi3)) {
            if ( sayi2 < sayi3) {
                System.out.println("sayi1 < sayi2 < sayi3");
            }else {
                System.out.println("sayi1 < sayi3 < sayi2");
            }

        } else if ((sayi2>sayi1) && (sayi2 < sayi3)) {
            if ( sayi1 < sayi3) {
                System.out.println("sayi2 < sayi1 < sayi3");
            }else {
                System.out.println(" sayi2 < sayi3 < sayi1");
            }
        }else {
            if (sayi1 < sayi2) {
                System.out.println("sayi3 < sayi1 < sayi2");
            }else {
                System.out.println("sayi3 < sayi2 < sayi1");
            }
        }
    }
}
