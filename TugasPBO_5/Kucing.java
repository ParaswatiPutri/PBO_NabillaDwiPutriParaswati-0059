/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO_5;

/**
 *
 * @author lenovo
 */
public class Kucing extends Hewan{
    String ras;
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Ras; " + ras);
    }
    public void bersuara(){
        System.out.println("Suara: Meow...Meow..");
    }
}
