package Latihan4Polimorfisme;

//Buat Program untuk menghitung volume dan luas permukaan dari balok dan kubus dengan menggunakan konsep polimorfisme!

public class BangunRuang {
    private double p, l, t, s; // Deklarasi variabel instance untuk panjang, lebar, tinggi, sisi dengan akses privat
    //bersifat privat, sehingga hanya dapat diakses melalui metode dalam kelas BangunRuang.
    
    //dua konstruktor yang beda parameter untuk inisialisasi objek Balok dan Kubus.
    public BangunRuang(double panjang, double lebar, double tinggi) { //Konstruktor untuk objek Balok dengan 3 parameter
        this.p = panjang; // Inisialisasi variabel 'p' dengan nilai panjang
        this.l = lebar; // Inisialisasi variabel 'l' dengan nilai lebar
        this.t = tinggi; // Inisialisasi variabel 't' dengan nilai tinggi
    }

    public BangunRuang(double s) { // Konstruktor untuk objek Kubus dengan 1 parameter sisi
        this.s = s;// Inisialisasi variabel sisi untuk kubus yang semua sisi nya ber ukuran sama
    } 
    //method hitung volume Balok
    public double VolumeBalok(){ //Volume Balok : 2 x (panjang.lebar + panjang.tinggi + lebar.tinggi)
        return 2 * ((p * l) + (p * t) + (l * t)); //Mengembalikan hasil perhitungan  volume balok
    }
    //method hitung luas permukaan Balok
    public double LuasPermukaanBalok(){ //Luas Permukaan Balok : panjang x lebar x tinggi
        return p * l * t; //Mengembalikan hasil perhitungan luas permukaan balok
    }
    //method hitung volume Kubus
    public double VolumeKubus(){ //Volume Kubus : sisi x sisi x sisi
        return s * s * s;//Mengembalikan hasil perhitungan volume kubus
    }
    //method hitung luas permukaan Kubus
    public double LuasPermukaanKubus(){ //Luas Permukaan Kubus: 6 x (sisi x sisi)
        return 6 * (s * s);//Mengembalikan hasil perhitungan luas permukaan kubus
    } 
} //ke-4 method diatas menggunakan polimorfisme, metode berbeda untuk objek berbeda.