/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooppert1;

/**
 *
 * @author Asus
 */
public class Buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    
    public static int totalBukuBerhasilDibuat = 0;
    
    public Buku(String judulBuku, String pengarangBuku, int tahunTerbit){
        this.judul = judulBuku;
        this.pengarang = pengarangBuku;
        this.tahunTerbit = tahunTerbit;
        
        totalBukuBerhasilDibuat++;
    }
    
    public String getJudul(){
        return this.judul;
    }
    
    public String getPengarang(){
        return this.pengarang;
    }
    
    public int getTahunTerbit(){
        return this.tahunTerbit;
    }
    
    public void setJudul(String Judul){
        this.judul = judul;
    }
    
    public void setPengarang(String Pengarang){
        this.pengarang = pengarang;
    }
    
    public void setTahunTerbit(int tahunTerbit){
        if(tahunTerbit > 0){
            this.tahunTerbit = tahunTerbit;
        }else{
            System.out.println("Tahun terbit tidak valid");
        }
    }
    
    public void tampilkanInfoBuku(){
        System.out.printf("Judul: %-20s | Pengarang: %-15s | Tahun: %d%n", judul, pengarang, tahunTerbit);
    }
}
