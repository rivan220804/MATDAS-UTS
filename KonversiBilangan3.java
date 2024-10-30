import java.util.Scanner;
/**
 * KonversiBilangan3
 */
public class KonversiBilangan3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // Konversi Heksadesimal 1F4 ke Desimal dan Biner
         String heksadesimal = "1F4";
         int desimalDariHeksadesimal = Integer.parseInt(heksadesimal, 16);
         String binerDariHeksadesimal = Integer.toBinaryString(desimalDariHeksadesimal);
 
         System.out.println("Heksadesimal 1F4 ke Desimal: " + desimalDariHeksadesimal);
         System.out.println("Heksadesimal 1F4 ke Biner: " + binerDariHeksadesimal);
 
    }
}
