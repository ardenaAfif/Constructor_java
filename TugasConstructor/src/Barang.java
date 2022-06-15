/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hanif
 */
public class Barang {
    //membuat variabel
    String nama;
    String tipe;
    
   //membuat contructor: 
   //suatu metode khusus yang akan dijalankan secara otomatis pada saat objek tersebut diciptakan
   //Syarat Constructor : (1) nama constructor harus sama dengan nama class yaitu Barang
   //Syarat Constructor : (2) constructor tidak memiliki nilai balikan (void atau tipe data yang lain)
    
    public Barang(){ //contructor tanpa parameter (kosong) akan di isikan variabel akan diisikan data wberikut:
        //membuat nilai default
        this.nama = "Nama Barang belum diisikan ";
        this.tipe = "Tipe Barang belum diisikan ";
    }
    //membuat constructor 2 untuk input data (menggunakan parameter)
     public Barang(String nama, String tipe){
         this.nama = nama;
         this.tipe = tipe;              
     }
    
    //membuat method untuk mengembalikan 2 variabel string sehingga class mahasiswi bisa mendapatkan variabel nama dan alamat
    public String getNama(){
        return this.nama;
    }
     public String getProdi(){
        return this.tipe;
    }
}
    
// selanjutnya buat class lain untuk menciptakan objek dari class Barang
// memanfaatkan data form untuk menampilkan data dari objek mahasiswa

