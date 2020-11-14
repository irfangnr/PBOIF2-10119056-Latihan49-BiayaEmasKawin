/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan49.biayaemaskawin;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Biaya emas atau jasa
 */

public class PBOIF210119056Latihan49BiayaEmasKawin {

    public static void main(String[] args) {
        Emas emas=new Emas(15.7);
        System.out.println("====Mahar====");
        System.out.println("Nama : "+emas.nama(emas.nama("Hendi")));
        
        System.out.println("Berat Emas : "+emas.getBerat()+" gram");
        
        emas.setHarga(570000);
        System.out.println("Total bayar : "+emas.harga(emas.getHarga()));
    }
    
}
