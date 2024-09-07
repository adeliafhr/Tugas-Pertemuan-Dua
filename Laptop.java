/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuankedua;

/**
 *
 * @author Lenovo
 */
public class Laptop extends PerangkatElektronik implements Belajar, Menonton, Game {
    private String merek;
    private String sistemOperasi;
    
    @Override
    public void menontonFilm() {
        System.out.println("laptop digunakan menonton film");
    }

    @Override
    public void dibuatBelajar() {
        System.out.println("laptop digunakan belajar");
    }

    @Override
    public void bermainGame() {
        System.out.println("laptop digunakan bermain game");
    }
    
    public void Model(){
        System.out.println("memiliki model macbook");
    }
    
    public void kumpulanModel(){
        this.Model();
        super.Model();
    }
    
public Laptop(){
    System.out.println("halo dari laptop");
}

    /**
     * @return the merek
     */
    public String getMerek() {
        return merek;
    }

    /**
     * @param merek the merek to set
     */
    public void setMerek(String merek) {
        this.merek = merek;
    }

    /**
     * @return the sistemOperasi
     */
    public String getSistemOperasi() {
        return sistemOperasi;
    }

    /**
     * @param sistemOperasi the sistemOperasi to set
     */
    public void setSistemOperasi(String sistemOperasi) {
        this.sistemOperasi = sistemOperasi;
    }
}
