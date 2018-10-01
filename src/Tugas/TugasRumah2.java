/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author User
 */
public class TugasRumah2 {
    public static void main (String [] args, String[] Siswa){
        try {
            String [] siswa = new String [2];
            Siswa [0] = "Wildan";
            Siswa [1] = "Ferdi";
            Siswa [2] = "Taufiq";
            System.out.println (siswa[4]);
            //=========================================
            int angka = 7 ;
            int hasil = angka = angka/0;
            System.out.println(hasil);
        } catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Data Array yang ingin dikeluarkan tidak ada");
        }  catch(ArithmeticException ex2){
            System.out.println("Tidak boleh menggunakan pembagian dengan 0");
        } 
                
    }
    
}
