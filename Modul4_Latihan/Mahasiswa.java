package Modul4_Latihan;

import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa{
    String Nama, Kelas, MatkulPraktikum;
    int nim;

    public Mahasiswa(String Nm, String Kl, String Mat, int ni){
        Nama =Nm;   Kelas = Kl;     MatkulPraktikum=Mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Mahasiswa> Mhs = new HashMap<>();
        String inputan;
        Mahasiswa data;

        Mhs.put("1", new Mahasiswa("Putri","3M","Strukdat",311256));
        Mhs.put("2", new Mahasiswa("Agus","3A","matematika",311070));
        Mhs.put("3", new Mahasiswa("Evina", "3G","Pemrograman",311390));

        System.out.println("Masukkan ID : ");
        inputan = input.nextLine();
        data = Mhs.get(inputan);

        if(data != null){
            System.out.println("Data Mahsiswa : "+ data.Nama +"\nKelas : "+data.Kelas+"\nMatkul : "+data.MatkulPraktikum+"\nnim : "+data.nim);
        }

    }

}
