/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO5;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main (String[] args) {
        Kucing kucing = new Kucing ();
        kucing.nama = "Bony";
        kucing.jenis = "Persia";
        kucing.suaraKucing = "miaww miaww miaww";
        kucing.tampilkanInfo();
        System.out.println();
        
        Anjing anjing = new Anjing();
        anjing.nama = "Molly";
        anjing.jenis = "Poodle";
        anjing.suaraAnjing = "guk guk guk";
        anjing.tampilkanInfo();
        System.out.println();
        
        Kanguru kanguru = new Kanguru ();
        kanguru.nama = "Doly";
        kanguru.jenis = "Nabarlek";
        kanguru.berkembangbiak = "Melahirkan";
        kanguru.ciriKhas = "Memiliki Kantong";
        kanguru.tampilkanInfo();
        System.out.println();
        
        Zebra zebra = new Zebra ();
        zebra.nama = "Boy";
        zebra.jenis = "Grevy";
        zebra.berkembangbiak = "Melahirkan";
        zebra.ciriKhas = "Badan Berwarna Hitam Putih";
        zebra.tampilkanInfo();
        System.out.println();
         
    }
}
