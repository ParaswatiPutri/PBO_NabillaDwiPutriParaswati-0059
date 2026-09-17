/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO_5;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[]args){
        System.out.println("=== Coba Kelas Hewan===");
        Kucing kucing = new Kucing();
        kucing.nama = "Mimi";
        kucing.jenis = "Mamalia";
        kucing.ras = "Persia";
        kucing.tampilkanInfo();
        kucing.bersuara();
        
        System.out.println();
        
        Anjing anjing = new Anjing();
        anjing.nama = "Heli";
        anjing.jenis = "Mamalia";
        anjing.ras = "Golden Retriever";
        anjing.tampilkanInfo();
        anjing.bersuara();
        
        System.out.println("\n=== Coba Hierarki level 3===");
        Mobil mobil = new Mobil();
        mobil.nama = "Sedan Sport";
        mobil.jumlahRoda = 4;
        mobil.jumlahPintu = 2;
        mobil.tampilkanInfo();
        
        System.out.println();
        
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Motor Bebek";
        motor.jumlahRoda = 2;
        motor.jenisMesin = " 4-tak";
        motor.tampilkanInfo();
                
    }
}
