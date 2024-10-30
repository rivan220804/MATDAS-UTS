import java.util.Scanner;
/**
 * KonversiBilangan1
 */
public class KonversiBilangan1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
            int desimal = 450;
        
            // Konversi desimal ke biner
            String biner = Integer.toBinaryString(desimal);
                
            // Konversi desimal ke heksadesimal
            String heksadesimal = Integer.toHexString(desimal).toUpperCase();
        
            System.out.println("Desimal: " + desimal);
            System.out.println("Biner: " + biner);
            System.out.println("Heksadesimal: " + heksadesimal);
            
        
            



    }
}