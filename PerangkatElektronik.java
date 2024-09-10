/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuankedua;

/**
 *
 * @author Lenovo
 */
public class PerangkatElektronik {
    private String nama;
    private int tahunProduksi;
    
public PerangkatElektronik(){
    System.out.println("halo dari perangkat elektronik");
}

public void model(){
    System.out.println("bermodel laptop gaming");
}
    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the tahunProduksi
     */
    public int getTahunProduksi() {
        return tahunProduksi;
    }

    /**
     * @param tahunProduksi the tahunProduksi to set
     */
    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
}
