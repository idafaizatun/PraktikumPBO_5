/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main (String[] args) {
        Mobil mobil = new Mobil ();
        mobil.nama = "Hyundai";
        mobil.kecepatan = 185;
        mobil.jumlahPintu = 4;
        mobil.tampilkanInfo();
        
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Honda";
        motor.kecepatan = 100;
        motor.jenisMesin = "2-tak";
        motor.tampilkanInfo();
    }
}
