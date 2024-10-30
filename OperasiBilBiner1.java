import java.util.Scanner;
/**
 * OperasiBilBiner1
 */
public class OperasiBilBiner1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
                String biner1 = "110101"; 
                String biner2 = "10111";  
        
                // Penjumlahan biner
                String hasilPenjumlahan = Integer.toBinaryString(
                    Integer.parseInt(biner1, 2) + Integer.parseInt(biner2, 2));
            
                System.out.println("Hasil Penjumlahan Biner:");
                System.out.println(biner1 + " + " + biner2 + " = " + hasilPenjumlahan);
                
        
    }
}
