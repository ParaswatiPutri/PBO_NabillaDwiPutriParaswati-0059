/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS_NabillaDwiPutriParaswati;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args){
        Elektronik laptop = new Elektronik("Laptop", 15000000, 2);
        PegawaiTetap pegawai1 = new PegawaiTetap("Nabilla", 5000000, 1000000);
        
        System.out.println("1. Output Produk");
        laptop.tampilkanInfo();
        System.out.println();
        
        System.out.println("2. Output Pegawai");
        pegawai1.tampilkanInfo();
        System.out.println();
        
        Produk produkPolimorfisme = new Makanan("Snack", 15000, "2026-09-29");
        Pegawai pegawaiPolimorfisme = new PegawaiKontrak("Karina", 3000000, 12);
        
        System.out.println("3. Output Polimorfisme");
        produkPolimorfisme.tampilkanInfo();
        System.out.println();
        pegawaiPolimorfisme.tampilkanInfo();
    }
}
