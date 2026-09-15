/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author lenovo
 */
public class Praktikum_PBO4 {
    public static void main(String[] args){
        Mobil mobilBalap = new Mobil("sport Car", 300, "V8 Turbo", 2);
        System.out.println("=== Informasi Kendaraan (Parent) ===");
        mobilBalap.tampilkanInfoKendaraan();
        
        System.out.println("=== Informasi Mobil (Subclass) ===");
        mobilBalap.tampilkanInfoMobil();
        
        mobilBalap.jenisMesin = "Electric";
        System.out.println("\nJenis Mesin Setelah Diubah Langsung: " + mobilBalap.jenisMesin);
    }
}
