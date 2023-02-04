package soal1;
import java.util.Scanner; //menambahkan library untuk menggunakan fungsi Scanner scan = new Scanner(Sytem.in)
/**
 *
 * @author Muhamad Mathar Rizqi
 */
public class Soal1 {
    public static void main(String[] args) {
        String kalimat; //mendeklarasi string bernama kalimat
        try (Scanner scan = new Scanner(System.in)) { //membuat objek baru bernama scan untuk menerima input user
            kalimat = scan.nextLine(); //variable kalimat di isi oleh input user
        }
        kalimat = kalimat.trim(); //.trim()" adalah sebuah method yang digunakan untuk menghapus spasi pada awal dan akhir dari sebuah string
        if(kalimat.length()==0){ //memeriksa apakah ukuran dari kalimat adalah 0, jika iya print 0
            System.out.println(0);
        }
        String[] tokens = kalimat.split("[^A-Za-z]+");
        /*
            .split("[^A-Za-z]+")" adalah sebuah method yang digunakan untuk membagi sebuah string menjadi
            beberapa bagian. Dalam hal ini, variabel kalimat akan dibagi berdasarkan regex "[^A-Za-z]+",
            yang berarti semua karakter yang tidak termasuk huruf besar atau huruf kecil akan menjadi 
            pemisah antar bagian. nantinya string yang sudah dipisah akan dimasukan pada variable tokens 
            yang bertipe string
        */
            System.out.println(tokens.length); //menampilkan jumlah string yang ada pada variable tokens
        for (String token : tokens){
            /*
                merupakan perulangan for-each yang digunakan untuk mengiterasi setiap elemen pada sebuah array. 
                Dalam hal ini, setiap elemen pada array tokens akan diasosiasikan dengan variabel bernama token 
                dan akan dieksekusi pada setiap perulangan
            */
            System.out.println(token);
        }
    }
    
}
