/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3.Tugas;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Lamborghini", "Miura", 1966, "Miura Verde");  
        mobil1.displayInfo();  
        mobil1.startEngine();          
        Mobil mobil2 = new Mobil("Bugatti", "Veyron 16.4", 2005, "Atlantic Blue & Black"); 
        mobil2.displayInfo();  
        mobil2.startEngine();  
       
        mobil1.setinputWarna("Hitam");
        System.out.println("Mobil anda telah di cat ulang");  
        mobil1.displayInfo();   
    }
}
