/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuankedua;

/**
 *
 * @author Lenovo
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Laptop samsung = new Laptop();
        samsung.dibuatBelajar();
        samsung.menontonFilm();
        samsung.bermainGame();
        samsung.kumpulanModel();
        System.out.println("");
        PerangkatElektronik laptop = (PerangkatElektronik) samsung;
        laptop.setNama("acer");
        laptop.setTahunProduksi(2005);
        System.out.println("ini casting");
        System.out.println("nama laptop " + laptop.getNama()+ " tahun produksi laptop " + laptop.getTahunProduksi());
    }
}
