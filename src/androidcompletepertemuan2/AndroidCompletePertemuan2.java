/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package androidcompletepertemuan2;

import java.util.Random;

/**
 *
 * @author irfanasidiq
 */
public class AndroidCompletePertemuan2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassBaru kelas1 = new ClassBaru();
        
        kelas1.jumlahSiswa = 20;
        kelas1.jumlahSiswaLakiLaki = 10;
        kelas1.jumlahSiswaPerempuan = 10;
        kelas1.namaKelas = "Kelas Kreatif";
        kelas1.setNamaWaliKelas("Pak Sanusi");
        System.out.println("======="+kelas1.namaKelas+"=======");
        System.out.println("Nama Walikelas : " +kelas1.getNamaWaliKelas());
        kelas1.banyakSiswa();

        System.out.println("");

        ClassBaru kelas2 = new ClassBaru();
        kelas2.jumlahSiswa = 30;
        kelas2.jumlahSiswaLakiLaki = 16;
        kelas2.jumlahSiswaPerempuan = 14;
        kelas2.namaKelas = "Kelas Objektif";
        kelas2.setNamaWaliKelas("Ibu Ningsih");
        System.out.println("======="+kelas2.namaKelas+"=======");
        System.out.println("Nama Walikelas : " +kelas2.getNamaWaliKelas());
        kelas2.banyakSiswa();
        
        System.out.println("");
        
        ClassBaru kelas3 = new ClassBaru("Kelas Inisiatif", 40, "Pak Bambang", 15, 25);
        System.out.println("======="+kelas3.namaKelas+"=======");
        System.out.println("Nama Walikelas : " +kelas3.getNamaWaliKelas());
        kelas3.banyakSiswa();
        
        //looping ada 3
        //for, while sama do while
        for(int x = 1; x <= 5; x++){
            for(int y = x; y<=5; y++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        //while
        int x = 0;
        while(x <= 5){
            System.out.println(x);
            x++;
        }
        
        //do while
        int y = 0;
        do{
            System.out.println(y);
            y++;
        }while(y <= 5);
        
        
        //materi array
        int[] nilai = new int[3];
        nilai[0] = 1;
        nilai[1] = 2;
        nilai[2] = 3;
        
        int jumlahNilai[] = {1, 2, 3, 4 ,5};
        String namaHari[];
        namaHari = new String[7];
        namaHari[0] = "Senin";
        namaHari[1] = "Selasa";
        namaHari[2] = "Rabu";
        namaHari[3] = "Kamis";
        namaHari[4] = "Jumat";
        namaHari[5] = "Sabtu";
        namaHari[6] = "Minggu";
        
        String hari[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        
        System.out.println("nilai "+nilai[2]);
        System.out.println("jumlah nilai "+jumlahNilai[4]);
        System.out.println("Hari ke-5 "+namaHari[4]);
        System.out.println("Hari ke-7 "+hari[6]);

        Random randomvalue = new Random();
        int[] nilaiRandom = new int[10];
        for(int z = 0; z < 10 ; z++){
            nilaiRandom[z] = randomvalue.nextInt(20);
        }
        for(int z =0; z<10; z++){
            System.out.println("nilai ke -"+(z+1)+" adalah "+nilaiRandom[z]);
        }
        
        ClassBaru kumpulanKelas[] = new ClassBaru[3];
        kumpulanKelas[0] = kelas1;
        kumpulanKelas[1] = kelas2;
        kumpulanKelas[2] = kelas3;
        
        System.out.println("NamaKelas kelas 3 adalah "+kumpulanKelas[2].namaKelas+
                " dengan WaliKelas adalah "+kumpulanKelas[2].getNamaWaliKelas());
    }
    
}
