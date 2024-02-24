/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.spekMesin;

/**
 *
 * @author BIMA
 */
public class Mesinku {
    public static void main(String[]args){
    
        //objek dari class mobilku
        mesinMobil mesinMobil=new mesinMobil();
        
        //mengisi atribut class
        mesinMobil.Namamesin="RB 26 TWIN TURBO";
        mesinMobil.tahunRakit=1999;
        mesinMobil.kapasitasMesin=2600;
        
        //mengisi isi atribut
        System.out.println("Mesin = " + mesinMobil.Namamesin);
        System.out.println("Tahun Rakit = " + mesinMobil.tahunRakit);
        System.out.println("Kapasitas Mesin = " + mesinMobil.kapasitasMesin);
    }
}
