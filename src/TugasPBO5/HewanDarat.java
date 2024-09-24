/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO5;

/**
 *
 * @author ASUS
 */
public class HewanDarat extends Hewan {
    String berkembangbiak;
    String ciriKhas;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Berkembangbiak: "+ berkembangbiak);
        System.out.println("Ciri Khas: "+ ciriKhas);
    
    }
}