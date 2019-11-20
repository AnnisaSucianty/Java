/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5.kambing.global;

/**
 *
 * @author USER
 * Nama  : Annisa Sucianty Aulya Suganda
 * Kelas : TI-B
 * NIM   : A2.1900020
 * Deskripsi Program : Project ini berisi tentang Kambing Global.
 */
public class Latihan5KambingGlobal {
// Variabel jumlahKambing menjadi variabel instance
    
    int jumlahKambing = 88; 
        
//metode untuk menampilkan jumlahKambing
public void getjumlahKambing() {
      System.out.println("jumlah Kambing: " + jumlahKambing); 
}


public void tambahKambing() {
    jumlahKambing = jumlahKambing + 5;
    System.out.println("jumlah Kambing setelah ditambah:  " + jumlahKambing);
}

public static void main (String[] args) {
    Latihan5KambingGlobal KambingSusu = new Latihan5KambingGlobal();
    
    // Menampilkan jumlahKambing yang ada saat program pertama x berjalan
  KambingSusu.getjumlahKambing();
    
    
  // Menambah satu Kambing
  KambingSusu.tambahKambing();
  
  // Menampilkan jumlah kambing yang ada
  KambingSusu.getjumlahKambing();
}
    
}
