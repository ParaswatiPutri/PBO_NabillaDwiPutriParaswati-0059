/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO_6;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(new Buku("The Chronicles of Narnia", 500000));
        keranjang.tambahProduk(new Elektronik("Mouse Wireless", 200000));
        keranjang.tambahProduk(new Pakaian("Kemeja Polos", 150000));
        keranjang.tampilkanDetailBelanja();
    }
}
