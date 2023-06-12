package com.maulana_rafi.pbo.pertemuan4;

public class manajer extends pegawai {
    public void bonus(int bonus){
        System.out.println("Pegawai dengan nama : " + nama + " (" + nip + ") Mendapatkan bonus sebesar Rp " + bonus);
    }

    public void extraInfo() {
        System.out.println("Jabatan Pegawai : Manajer");
    }

    public void bonus(){
        System.out.println("Error : Harap Masukkan nominal bonus !");
    }
}
