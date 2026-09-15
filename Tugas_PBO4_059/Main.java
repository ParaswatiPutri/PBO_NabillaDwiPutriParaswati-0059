/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_PBO4_059;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args){
        Pekerja pekerja1 = new Pekerja("Luca Xylar", 30, "Software Engineer", 12000000);
        System.out.println("=== Data Pekerja Awal===");
        System.out.println(pekerja1.toString());
        
        pekerja1.setNama("Luca Wijaya");
        System.out.println("\n===Data Pekerja Setelah Ubah Nama===");
        System.out.println(pekerja1.toString());
        System.out.println("\n===Pengujian Akses Langsung Atribut===");
        System.out.println("Pekerjaan(Public): " + pekerja1.pekerjaan);
        System.out.println("Usia (Protected) : " + pekerja1.usia);
    }
    
}
