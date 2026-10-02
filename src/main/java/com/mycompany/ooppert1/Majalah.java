/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooppert1;

/**
 *
 * @author Asus
 */
public class Majalah extends Koleksi{
    String edisi;
    
    public Majalah(String judul, String pengarang, int tahunTerbit, String edisi){
        super(judul,pengarang,tahunTerbit);
        this.edisi = edisi;
    }
    
    @Override
    public void tampilkanInfo(){
        System.out.printf("Judul: %-20s | Pengarang: %-15s | Tahun: %d%n | edisi: %s%n", judul, pengarang, tahunTerbit, edisi);
    }
    
    @Override
    public void caraPinjam(){
        System.out.println("Ebook bisa didownload di aplikasi atau di web");
    }
}
