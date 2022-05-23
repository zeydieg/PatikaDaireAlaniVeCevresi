import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double r, alan, cevre, daire, a, pi = 3.14;

        System.out.print("Yarıçapı giriniz : ");
        r = inp.nextDouble();

        System.out.print("Merkez açısı ölçüsünü giriniz : ");
        a = inp.nextDouble();

        alan = (pi * r * r);
        System.out.println("Alan değeri : " + alan);
        cevre = (2 * pi * r);
        System.out.println("Çevre değeri : " + cevre);

        daire = (3.14 * (r * r) * a) / 360;
        System.out.print("Daire diliminin alanı : " + daire);
    }
}
