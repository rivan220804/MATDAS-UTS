import java.util.Scanner;
/**
 * KonversiBilangan2
 */
public class KonversiBilangan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          // Konversi Biner 11011000 ke Desimal dan Heksadesimal
        String biner = "11011000";
        int desimalDariBiner = Integer.parseInt(biner, 2);
        String heksadesimalDariBiner = Integer.toHexString(desimalDariBiner).toUpperCase();

        System.out.println("Biner 11011000 ke Desimal: " + desimalDariBiner);
        System.out.println("Biner 11011000 ke Heksadesimal: " + heksadesimalDariBiner);

    }
}
