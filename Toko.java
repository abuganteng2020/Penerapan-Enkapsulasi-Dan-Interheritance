/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMAD
 */
public class Toko {
    //mendefinisikan variabel
    private String Admin;
    int harga;
    int total;
    String merk;
    
    //menerapkan method Display
    public void Display(){
        System.out.println(" <<< Selamat Datang Disini hehe >>> ");
        System.out.println("             --- Ngadiluwih, Kediri 134131 ---        ");
    }
    //menerapkan method setAdmin
    public void setAdmin(String Admin){
        this.Admin = Admin;
    }
    //menerapkan method getAdmin
    public String getAdmin(){
        return Admin;
    }
}
