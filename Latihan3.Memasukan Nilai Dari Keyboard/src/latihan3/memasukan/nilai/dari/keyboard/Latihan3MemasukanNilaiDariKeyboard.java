package latihan3.memasukan.nilai.dari.keyboard;
import java.util.Scanner;

/**
 *
 * @author USER
 * Nama  : Annisa Sucianty Aulya Suganda
 * Kelas : Ti-B
 * NIM   : A2.1900020
 * Deskripsi Project : Project ini membahas tentang Memasukan Nilai Dari 
 * Keyboard.
 */
public class Latihan3MemasukanNilaiDariKeyboard {
    public static void main(String[] args) {
        System.out.println("Memasukan nama anda: ");
        Scanner scanner = new Scanner (System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
    }
    
}
