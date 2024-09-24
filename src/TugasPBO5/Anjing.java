/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO5;

/**
 *
 * @author ASUS
 */
public class Anjing extends Hewan {
    String suaraAnjing;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara Anjing: " + suaraAnjing);
    }
}
