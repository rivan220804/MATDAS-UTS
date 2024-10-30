import java.util.Scanner;
/**
 * OperasiBilBiner3
 */
public class OperasiBilBiner3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Biner1 = "1011";
        String Biner2 = "110";

        // Perkalian Biner
        String hasilPerkalian = Integer.toBinaryString (
            Integer.parseInt(Biner1,2) * Integer.parseInt(Biner2, 2));
        
            System.out.println("Hasil Perkalian Biner:");
            System.out.println(Biner1 + " x " + Biner2 + " = " + hasilPerkalian);
    


    }
}
