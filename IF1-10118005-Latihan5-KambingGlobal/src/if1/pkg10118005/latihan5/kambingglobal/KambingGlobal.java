/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan5.kambingglobal;

/**
 *
 * @author USER
 * NAMA   : Rycho Rantung
 * KELAS  : IF-1
 * NIM    : 10118005
 * Deskripsi Program : Program ini berisi program untuk menambah kambing
 */
public class KambingGlobal {

    /**
     * @param args the command line arguments
     */
    // Variabel jumlahkambing menjadi variabel instance 
    int jumlahKambing = 88;
    
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " +
                             jumlahKambing);
    }
    public static void main(String[] args) {
        KambingGlobal kambingsusu = new KambingGlobal();
        
        // Menampilkan jumlah kambing yang ada saat program x berjalan
        kambingsusu.getJumlahKambing();
        
        // Menambah satu kambing
        kambingsusu.tambahKambing();
        
        // Menampilkan jumlah kambing yang ada
        kambingsusu.getJumlahKambing();
        
    }
    
}
