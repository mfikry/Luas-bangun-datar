/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABCOM
 */
public class LuasBangunDatar {
    static class hitungLuas{
        static int sisi1=0,sisi2=0,sisi3=0,panjang=0,lebar=0,phi=0,r=0;
        public static int hitungLuasPersegi(){
            sisi1 += 2;
            sisi2 += 2;
            sisi3 += 2;
            return sisi1+sisi2+sisi3;
            
        }
        public static int hitungLuasPersegiPanjang(){
            panjang += 2;
            lebar += 2;
            return panjang * lebar;
        }
        public static int hitungLuasLingkaran(){
            
            return phi * r * r;
        }
    }
    public static void main(String[]args){
        System.out.println("Luas Persegi:"); 
        for(int i = 0; i<5;i++){
            int hasil = hitungLuas.hitungLuasPersegi();
            System.out.println(hasil);    
        }
        System.out.println();
        System.out.println("Luas Persegi Panjang:");
        for(int i = 0; i<5;i++){
            int hasil = hitungLuas.hitungLuasPersegiPanjang();
            System.out.println(hasil);    
        }
        System.out.println();
        System.out.println("Luas Persegi Segitiga:");
        for(int i = 0; i<5;i++){
            int hasil = hitungLuas.hitungLuasLingkaran();
            System.out.println(hasil);    
        }
    }
}
















