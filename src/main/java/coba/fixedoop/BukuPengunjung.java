/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba.fixedoop;

/**
 *
 * @author Fathurr
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BukuPengunjung {
    private List<Tamu> tamuList = new ArrayList<>();
    private List<TamuVIP>tamuVpList = new ArrayList<>();
    
    public BukuPengunjung() {
    }

    public BukuPengunjung(List<Tamu> tamuList) {
        this.tamuList = tamuList;
    }

    public void addTamu(Tamu tamu){
        this.tamuList.add(tamu);
    }
    
    public void addTamuVIP(TamuVIP tamuVp){
        this.tamuVpList.add(tamuVp);
    }
    
    public static void addBukuTamu(Scanner scanner, BukuPengunjung bukuPengunjung,boolean check) {
        System.out.println("");
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan alamat Anda: ");
        String alamat = scanner.nextLine();
        System.out.print("Masukkan nomor hp: ");
        String nomor_hp = scanner.nextLine();
        System.out.print("Masukkan Komentar: ");
        String komentar = scanner.nextLine();
        
        if(check == true){
            System.out.print("Hubungan Keluarga: ");
            String rel = scanner.nextLine();
            Tamu tamuVp = new Tamu(nama,alamat,nomor_hp,komentar,rel);
            bukuPengunjung.addTamu(tamuVp);
        }else if(check == false){
            Tamu tamuBaru = new Tamu(nama,alamat,nomor_hp,komentar);
            bukuPengunjung.addTamu(tamuBaru);
        }
    }
      
    public static void lihatBukuTamu(BukuPengunjung bp1) {
        bp1.printTamu();
    }
    
    public static void lihatBukuTamuVp(BukuPengunjung bp1) {
        bp1.printTamuVIP();
    }
    
   /* public static void lihatSemuaBukuTamu(BukuPengunjung bp1) {
        System.out.println("=================================");
        System.out.println("Tamu Biasa");
        bp1.printTamu();
        
        
        System.out.println("");
        System.out.println("*********************************");
        System.out.println("Tamu VIP");
        bp1.printTamuVIP();
    }*/
    
     public static void lihatSemuaBukuTamu(BukuPengunjung bp1, boolean check){
         System.out.println("coba");
         bp1.printTamu();
     }
    
    public void printTamu(){
        
        for(Tamu tamu:tamuList){
            System.out.println("=================================");
            tamu.printTamu();
        }
        System.out.println("=================================");
    }
    
    public void printTamuVIP(){
        for(TamuVIP tamuVp:tamuVpList){
            tamuVp.printTamuVIP();
        }
        System.out.println("*********************************");
    }
    
   
    
} 