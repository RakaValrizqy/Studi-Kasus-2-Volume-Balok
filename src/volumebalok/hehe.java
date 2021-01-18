package volumebalok;
import java.util.Scanner;
public class hehe {
    //variabel
    Scanner io = new Scanner(System.in);
    double panjang, lebar, tinggi, total;
    String hasil;
    
    //method void untuk user input
    void isi(){
        System.out.print("Masukkan panjang balok : ");
        panjang = io.nextDouble();
        
        System.out.print("Masukkan lebar balok   : ");
        lebar = io.nextDouble();
        
        System.out.print("Masukkan tinggi balok  : ");
        tinggi = io.nextDouble();
    }
    //method void untuk menghitung hasil
    void hitung(){
        total = panjang * lebar * tinggi;
    }
    //method non void untuk menampilkan hasil program
    String hasil(){
        System.out.println("============================");
        System.out.println("Total volume balok : "+total);
        return hasil;
    }
}
