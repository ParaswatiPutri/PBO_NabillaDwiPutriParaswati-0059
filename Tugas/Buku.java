/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author lenovo
 */
public class Buku extends Produk {
    private String penulis;
    
    public Buku(String nama, double harga, String penulis) {
        super(nama, harga);
        this.penulis = penulis;
    }
    
    @Override
    public double hitungDiskon() {
        return harga * 1.10;
    }
    @Override
    public void tampilInfo() {
        System.out.println("\n[BUKU] " + nama + "\n | Penulis: " + penulis + "\n | Harga: Rp" + harga + "\n | Diskon: Rp" + hitungDiskon());
    }
}
