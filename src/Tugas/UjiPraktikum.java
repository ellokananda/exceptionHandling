/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class UjiPraktikum {
    public static void main (String [] args) throws IOException{
        System.out.println ("Masukkan nama Anda : ");
        String nama;
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);
        nama = br.readLine();
       System.out.println("Halo " + nama + ",bagaimana dengan harimu");
    }
   
    }
   

