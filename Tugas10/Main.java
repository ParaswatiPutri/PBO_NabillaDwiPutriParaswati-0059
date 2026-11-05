/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas10;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[]args){
        double hargaElektronik = 2000000;
        double hargaMakanan = 50000;
        
        Pembayaran laptop = new Elektronik();
        double pajakElektronik = laptop.hitungPajak(hargaElektronik);
        
        Pembayaran soto = new Makanan();
        double pajakMakanan = soto.hitungPajak(hargaMakanan);
        
        System.out.println("=== Sistem Perhitungan pajak Toko ===");
        System.out.println("Harga Elektronik: Rp " + hargaElektronik);
        System.out.println("Pajak Elektronik (10%): Rp " + pajakElektronik);
        System.out.println("==============");
        System.out.println("Harga Makanan: Rp " + hargaMakanan);
        System.out.println("Pajak Makanan (5%): Rp " + pajakMakanan);
               
    }
}
