/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author BIMA
 */
public class AksiMobil {
    public static void main(String[]args){
    
        //objek dari class mobilku
        Mobilku Mobilku=new Mobilku();
        
        //mengisi atribut class
        Mobilku.Nama="Nissan GTR R34";
        Mobilku.tahunProduksi=1999;
        Mobilku.Warna="Biru";
        
        //mengisi isi atribut
        System.out.println("Nama = " + Mobilku.Nama);
        System.out.println("Tahun Mobil = " + Mobilku.tahunProduksi);
        System.out.println("Warna Mobil = " + Mobilku.Warna);
    }
}
