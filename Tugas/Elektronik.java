/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author lenovo
 */
public class Elektronik extends Produk{
    private int garansiBulan;
    
    public Elektronik(String nama, double harga, int garansiBulan){
        super(nama, harga);
        this.garansiBulan = garansiBulan;
    }
    @Override
    public double hitungDiskon(){
        return harga * 0.15;
    }
    @Override
    public void tampilInfo() {
         System.out.println("\n[ELEKTRONIK] " + nama + "\n | Garansi: " + garansiBulan + "Bulan" + "\n | Harga: Rp" + harga + "\n | Diskon: Rp" + hitungDiskon());
    }
}
