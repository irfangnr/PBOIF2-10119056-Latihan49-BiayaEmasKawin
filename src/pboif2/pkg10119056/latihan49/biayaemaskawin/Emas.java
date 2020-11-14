/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan49.biayaemaskawin;

/**
 *
 * @author ACER
 */

class Emas{
    private float berat;
    private float harga;
    
    Emas(double berat){
        this.berat=(float) berat;
    }
    public float getBerat() {
        return berat;
    }

    public float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }
    
    String nama(String nama){
        return nama;
    }
    double harga(float parHarga){
        harga=parHarga*berat;
        return harga;
    }

    
}