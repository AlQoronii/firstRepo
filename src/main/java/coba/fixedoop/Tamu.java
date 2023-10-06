/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba.fixedoop;

/**
 *
 * @author Fathurr
 */
public class Tamu {
    private String nama,alamat,nomor_hp,komentar,rel;
    
    public Tamu() {
    }

    public Tamu(String nama, String alamat, String nomor_hp,String komentar) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomor_hp = nomor_hp;
        this.komentar = komentar;
    }
    
    public Tamu(String nama, String alamat, String nomor_hp,String komentar,String relation) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomor_hp = nomor_hp;
        this.komentar = komentar;
        this.rel = relation;
    }
    
    

    
}
