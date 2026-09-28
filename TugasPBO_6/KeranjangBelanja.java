/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO_6;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class KeranjangBelanja {
    private List<Produk> listProduk;
    public KeranjangBelanja() {
       listProduk = new ArrayList<>();
    }
    public void tambahProduk(Produk produk){
        listProduk.add(produk);
    }
    public double hitungTotalHarga() {
        double total = 0;
        for (Produk p : listProduk) {
            double hargaSetelahDiskon = p.getHarga() - p.hitungDiskon();
            total += hargaSetelahDiskon;
        }
        return total;
    }
    public void tampilkanDetailBelanja() {
        System.out.println("=== Detail Keranjang Belanja===");
        for (Produk p: listProduk){
            double diskon = p.hitungDiskon();
            double hargaAkhir = p.getHarga() - diskon;
            System.out.println("\n-" + p.getNama() + "\nHarga: Rp " + p.getHarga() + 
                    "\nDiskon: Rp" + diskon + "\nHarga Akhir: Rp" + hargaAkhir);
        }
        System.out.println("\nTotal Bayar Setelah Diskon: Rp" + hitungTotalHarga());
    } 
}
