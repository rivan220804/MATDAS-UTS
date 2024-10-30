import java.util.Scanner;
/**
 * OperasiBilBiner2
 */
public class OperasiBilBiner2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String biner1 = "111001";
        String biner2 = "10101";
        
        // Pengurangan biner
        String hasilPengurangan = Integer.toBinaryString(
            Integer.parseInt(biner1, 2) - Integer.parseInt(biner2, 2));
        
        System.out.println("Hasil Penguragan Biner:");
        System.out.println(biner1 + " + " + biner2 + " = " + hasilPengurangan);

    }
}
