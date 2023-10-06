/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba.fixedoop;

/**
 *
 * @author Fathurr
 */
public class TamuVIP extends Tamu {
    
    private String relation;
    
    public TamuVIP(){
    }
    
    public TamuVIP(String nama, String alamat, String nomor_hp, String komentar, String rel){
        super(nama,alamat,nomor_hp,komentar);
        this.relation = rel;
    }

    public void printTamuVIP(){
        System.out.println("*********************************");
        super.printTamu();
        System.out.println("Hubungan Keluarga: "+relation);
    }
}
