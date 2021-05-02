/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package androidcompletepertemuan2;

/**
 *
 * @author irfanasidiq
 */
public class ClassBaru {
    int jumlahSiswa = 0;
    String namaKelas;
    private String namaWaliKelas;
    int jumlahSiswaPerempuan = 0;
    int jumlahSiswaLakiLaki = 0;
    
    //constructor kosong
    public ClassBaru(){
        // do nothing
    }
    
    //constructor dengan parameter value
    public ClassBaru(String namaKelas, int jumlahSiswa,
            String namaWaliKelas, int jumlahSiswaPrp, int jumlahSiswaLk){
        this.namaKelas = namaKelas;
        this.jumlahSiswa = jumlahSiswa;
        this.namaWaliKelas = namaWaliKelas;
        jumlahSiswaPerempuan = jumlahSiswaPrp;
        jumlahSiswaLakiLaki = jumlahSiswaLk;
    }
    
    //constructor baru
    public ClassBaru(String namaKelas, int jumlahSiswa){
        this.namaKelas = namaKelas;
        this.jumlahSiswa = jumlahSiswa;
    }

    //ini merupakan method yang tidak memerlukan nilai balik
    public void banyakSiswa(){
        if(jumlahSiswa < 20){
            System.out.println("jumlah siswa kurang dari seharusnya, minimal 20 siswa");
        }else{
            System.out.println("jumlah siswa sesuai");
            if(jumlahSiswaPerempuan == jumlahSiswaLakiLaki){
                System.out.println("Jumlah Siswa Laki-laki dan Perempuan Sama Banyak");
            }else{
                if(jumlahSiswaPerempuan < jumlahSiswaLakiLaki){
                    System.out.println("Jumlah Siswa Laki-Laki Lebih banyak");
                }else{
                    System.out.println("Jumlah Siswa Perempuan Lebih banyak");
                }
            }
        }
    }
    
    //ini merupakan method yang memerlukan nilai balik
    public int jumlahSiswa(){
        return jumlahSiswa;
    }
    
    //method set
    //method yang dibuat untuk memberikan nilai terhadap 
    //suatu variable baik private ataupun tidak
    public void setNamaWaliKelas(String nama){
        namaWaliKelas = nama;
    }

    //method get
    //method yang dibuat untuk memberikan nilai balik value tertentu
    public String getNamaWaliKelas(){
        return namaWaliKelas;
    }
    
}
