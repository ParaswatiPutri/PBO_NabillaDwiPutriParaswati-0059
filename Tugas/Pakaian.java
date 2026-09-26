/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author lenovo
 */
public class Pakaian extends Produk {
    private String ukuran;

    public Pakaian(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }
    @Override
    public double hitungDiskon() {
        return harga * 0.20;
    }
    @Override
    public void tampilInfo() {
         System.out.println("\n[PAKAIAN] " + nama + "\n | Ukuran: " + ukuran + "\n | Harga: Rp" + harga + "\n | Diskon: Rp" + hitungDiskon());
    }
}
