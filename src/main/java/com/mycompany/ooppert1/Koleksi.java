/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooppert1;

/**
 *
 * @author Asus
 */
public class Koleksi {
    protected String judul;
    protected String pengarang;
    protected int tahunTerbit;
    
    public static int totalKoleksiBerhasilDibuat = 0;
    
    public Koleksi(String judulKoleksi, String pengarangKoleksi, int tahunTerbit){
        this.judul = judulKoleksi;
        this.pengarang = pengarangKoleksi;
        this.tahunTerbit = tahunTerbit;
        
        totalKoleksiBerhasilDibuat++;
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
    
    public void tampilkanInfo(){
        System.out.printf("Judul: %-20s | Pengarang: %-15s | Tahun: %d%n", judul, pengarang, tahunTerbit);
    }
    
    public void caraPinjam(){
        System.out.println("Barang dipinjam secara fisik ke meja administrasi");
    }
}
