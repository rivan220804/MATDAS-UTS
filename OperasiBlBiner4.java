import java.util.Scanner;
/**
 * OperasiBlBiner4
 */
public class OperasiBlBiner4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String biner1 = "101011";
        String biner2 = "110101";

        int desimal1 = Integer.parseInt(biner1, 2);
        int desimal2 = Integer.parseInt(biner2, 2);

        int hasilAnd = desimal1 & desimal2;
        int hasilOr = desimal1 | desimal2;
        int hasilXor = desimal1 ^ desimal2;

        System.out.println("Hasil Operasi Biner:");
        System.out.println("Operasi AND: " + biner1 + " AND " + biner2 + " = " + Integer.toBinaryString(hasilAnd));
        System.out.println("Operasi OR: " + biner1 + " OR " + biner2 + " = " + Integer.toBinaryString(hasilOr));
        System.out.println("Operasi XOR: " + biner1 + " XOR " + biner2 + " = " + Integer.toBinaryString(hasilXor));
    

    }
}
