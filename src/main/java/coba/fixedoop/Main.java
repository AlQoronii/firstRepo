/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package coba.fixedoop;

/**
 *
 * @author Fathurr
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BukuPengunjung bp1 = new BukuPengunjung();
        boolean check;
        Scanner scanner = new Scanner(System.in);
        outerloop:
        while(true){
            System.out.println("Pilih Jenis Tamu:");
            System.out.println("1. Tamu VIP");
            System.out.println("2. Tamu Reguler");
            System.out.println("3. Keluar");
            System.out.print("Pilih (1/2): ");
            try{
                int cek = scanner.nextInt();
                switch (cek){
                    case 1:
                        innerloop1:
                        while (true){
                            System.out.println("");
                            System.out.println("Menu:");
                            System.out.println("1. Tambah buku tamu");
                            System.out.println("2. Lihat Buku tamu");
                            System.out.println("3. Keluar");
                            System.out.print("Pilih menu (1/2/3): ");
                            try{
                            int choice = scanner.nextInt();
                            scanner.nextLine(); 
                                check = true;
                                switch (choice) {
                                    case 1:
                                        bp1.addBukuTamu(scanner, bp1, check);
                                        break;
                                    case 2:
                                        bp1.lihatBukuTamu(bp1);
                                        break;
                                    case 3:
                                        System.out.println("Terima kasih telah mengisi buku tamu");
                                        System.out.println("");
                                        break innerloop1;
                                        
                                    default:
                                        System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
                                }
                            }catch(Exception e){
                                System.out.println("Terjadi Kesalahan: "+e.getMessage());
                                break;
                            }
                        }
                        break;
                    case 2:
                        while (true){
                            System.out.println("");
                            System.out.println("Menu:");
                            System.out.println("1. Tambah buku tamu");
                            System.out.println("2. Lihat Buku tamu");
                            System.out.println("3. Lihat Buku Tamu VIP");
                            System.out.println("4. Lihat Semua Buku Tamu");
                            System.out.println("5. Keluar");
                            System.out.print("Pilih menu (1/2/3/4/5): ");
                            try{
                            int choice = scanner.nextInt();
                            scanner.nextLine(); 
                                check = false;
                                switch (choice) {
                                    case 1:
                                        bp1.addBukuTamu(scanner, bp1, check);
                                        break;
                                    case 2:
                                        bp1.lihatBukuTamu(bp1);
                                        break;
                                    case 3:
                                        bp1.lihatBukuTamuVp(bp1);
                                        break;
                                    case 4:
                                        bp1.lihatSemuaBukuTamu(bp1, check);
                                        break;    
                                    case 5:
                                        System.out.println("Terima kasih telah mengisi buku tamu!");
                                        System.out.println("");
                                        continue outerloop;
                                    default:
                                        System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
                                }
                            }catch(Exception e){
                                System.out.println("Terjadi Kesalahan: "+e.getMessage());
                                break;
                            }
                        }
                    case 3:
                        break outerloop;
                }
            }catch(Exception e){
                System.out.println("Terjadi Keaslahan: "+e.getMessage());
            }
        }
    } 
}
