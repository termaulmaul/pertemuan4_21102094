package com.maulana_rafi.pbo.pertemuan4;

public class Main {
    public static void main(String[] args) {
        manajer Manajer = new manajer();
        pegawai Pegawai = new pegawai();

        Manajer.nip = 18089;
        Manajer.nama = "Altaire";

        Pegawai.nip = 18141;
        Pegawai.nama = "Voltaire";

        Manajer.showInfo();
        Manajer.extraInfo();
        Manajer.bonus(8600000);
        Manajer.bonus();

        Pegawai.showInfo();
        Pegawai.extraInfo();

    }
}
