import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Yıl giriniz");
        int yil = scan.nextInt();

        if (yil % 100 == 0 && yil % 400 == 0) {
            System.out.println(yil + " yılı artık yıldır");
        } else if (yil%100!=0 && yil % 4 == 0) {
            System.out.println(yil + " yılı artık yıldır");
        } else {
            System.out.println("Artık yıl değildir");
        }

    }
}

