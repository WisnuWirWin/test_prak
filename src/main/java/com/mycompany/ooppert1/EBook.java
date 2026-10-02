/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooppert1;

/**
 *
 * @author Asus
 */
public class EBook extends Koleksi{
    int ukuranFile;
    
    public EBook(String judul, String pengarang, int tahunTerbit, int ukuranFile){
        super(judul,pengarang,tahunTerbit);
        this.ukuranFile = ukuranFile;
    }
    
    @Override
    public void tampilkanInfo(){
        System.out.printf("Judul: %-20s | Pengarang: %-15s | Tahun: %d%n | UkuranFile: %d MB%n", judul, pengarang, tahunTerbit, ukuranFile);
    }
    
    @Override
    public void caraPinjam(){
        System.out.println("Ebook bisa didownload di aplikasi atau di web");
    }
}
