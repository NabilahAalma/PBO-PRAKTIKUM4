package Latihan4Polimorfisme;

//Buat Program untuk menghitung volume dan luas permukaan dari balok dan kubus dengan menggunakan konsep polimorfisme!
//Class BangunRuang dapat diakses lewat method sebab privat (enkapsulasi)
public class BangunRuangDemo {//main class untuk jalan utama eksekusi program

    public static void main(String[] args) {//Kelas BangunRuang dengan dua konstruktor beda parameter dalam inisialisasi objek Balok1, Balok2, Kubus1, dan Kubus2 dari kelas BangunRuang
        BangunRuang Balok1 = new BangunRuang (2, 3, 5);
        BangunRuang Balok2 = new BangunRuang (2, 3, 7);  
        
        BangunRuang Kubus1 = new BangunRuang (2);
        BangunRuang Kubus2 = new BangunRuang(3);
 
        System.out.println("Balok Konstruktor 3 Parameter");
        System.out.println("Volume Balok         : " + Balok1.VolumeBalok());
        System.out.println("Luas Permukaan Balok : " + Balok2.LuasPermukaanBalok()); 
         
        System.out.println("Kubus Konstruktor 1 Parameter"); 
        System.out.println("Volume Kubus         : " + Kubus1.VolumeKubus()); 
        System.out.println("Luas Permukaan Kubus : " + Kubus2.LuasPermukaanKubus()); 
    }   
}
//run:
//Balok Konstruktor 3 Parameter
//Volume Balok         : 62.0
//Luas Permukaan Balok : 42.0
//Kubus Konstruktor 1 Parameter
//Volume Kubus         : 8.0
//Luas Permukaan Kubus : 54.0
//BUILD SUCCESSFUL (total time: 1 second)