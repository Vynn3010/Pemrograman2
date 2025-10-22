/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4_modifier;

/**
 *
 * @author calvi
 */

public class Utama_modifier {
    public static void main(String[] args) {
        System.out.println("======= MAHASISWA KE-1 =======");
        Mahasiswa_modifier m1 = new Mahasiswa_modifier("24552010", "Adi", 3.31);
        m1.tampilData();
        System.out.println( m1.predikat());
        m1.tambahIpk(0.3); // IPK naik, predikat harus berubah otomatis
        m1.tampilData();
        
        System.out.println("======= MAHASISWA KE-2 =======");
        Mahasiswa_modifier m2 = new Mahasiswa_modifier ("24552011","Ali",3.25);
        m2.tampilData();
        System.out.println(m2.predikat());
        
        
    }
}

