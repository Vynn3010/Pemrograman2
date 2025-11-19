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
class Mahasiswa_modifier {
    private String nim ="";
    private String nama = "";
    private Double ipk = 0.0;
    private String predikat ="";
    
  public Mahasiswa_modifier ( String nim, String nama, Double ipk) {
      this.nim = nim;
      this.nama = nama;
      this.ipk = ipk;
  }
  public void tampilData () {
            System.out.println("nim       : " + nim);
            System.out.println("nama      : " + nama);
            System.out.println("ipk       : " + ipk);
}
   public String predikat() {
        if (ipk >= 3.5) {
            predikat = "Cumlaude";
        }
        else if (ipk >= 3.25) {
            predikat = "Sangat Memuaskan";
  }
      return predikat;
}
   //tambah prosedur
    public void tambahIpk(double tambahan) {
        ipk += tambahan;
        if (ipk > 4.0) {
            ipk = 4.0; 
        }
        predikat = tentukanPredikat(ipk);
        System.out.println("\nIPK berhasil ditambahkan!");
        System.out.println("IPK terbaru : " + ipk);
        System.out.println("Predikat baru: " + predikat + "\n");
    }
   //fungsi dgn parameter
    public String tentukanPredikat(double nilaiIpk) {
        if (nilaiIpk >= 3.5) {
            return "Cumlaude";
        } else if (nilaiIpk >= 3.25) {
            return "Sangat Memuaskan";
        } else if (nilaiIpk >= 2.75) {
            return "Memuaskan";
        } else {
            return "Cukup";
        }
    }
}
