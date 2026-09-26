/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author lenovo
 */
public class Produk {
    protected String nama;
    protected double harga;
    
    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    public double hitungDiskon(){
        return 0;
    }
    
    public double hitungDiskon(double persenCustom){
        return harga * (persenCustom / 100);
    }
    public void tampilInfo(){
        System.out.println("\nProduk : " + nama + "\n Harga : Rp " + harga);
    }
}
