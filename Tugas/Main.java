/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args) {
        // Polimorfisme Runtime (Dynamic Polymorphism) melalui Overriding
        Produk p1 = new Buku("Pemrograman Java PBO", 120000, "Imam Adi Nata");
        Produk p2 = new Elektronik("Mouse Gaming", 250000, 12);
        Produk p3 = new Pakaian("Kemeja Flanel", 200000, "L");

        System.out.println("=== DEMO METHOD OVERRIDING (POLIMORFISME) ===");
        p1.tampilInfo(); // Menjalankan tampilInfo() milik Buku
        p2.tampilInfo(); // Menjalankan tampilInfo() milik Elektronik
        p3.tampilInfo(); // Menjalankan tampilInfo() milik Pakaian

        System.out.println("\n=== DEMO METHOD OVERLOADING ===");
        Produk produkUmum = new Produk("Barang Promo", 100000);
        
        // Memanggil hitungDiskon() tanpa parameter (default)
        System.out.println("Diskon standar: Rp" + produkUmum.hitungDiskon());
        
        // Memanggil hitungDiskon(double) dengan parameter custom (Overloaded)
        System.out.println("Diskon khusus (25%): Rp" + produkUmum.hitungDiskon(25));
    }
}

