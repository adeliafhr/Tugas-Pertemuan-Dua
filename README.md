# CASTING, CONSTRUCTOR, THIS, SUPER, IMPLEMENT 
## 🗂️ Table Of Contents
- [Casting](https://github.com/adeliafhr/Tugas-Pertemuan-Dua/blob/main/Utama.java)
- [Constructor](https://github.com/adeliafhr/Tugas-Pertemuan-Dua/blob/main/PerangkatElektronik.java)
- [This](https://github.com/adeliafhr/Tugas-Pertemuan-Dua/blob/main/Laptop.java)
- [Super](https://github.com/adeliafhr/Tugas-Pertemuan-Dua/blob/main/Laptop.java)
- [Implement](https://github.com/adeliafhr/Tugas-Pertemuan-Dua/blob/main/Belajar.java)
---
## 🎭 Casting
Casting adalah proses mengubah tipe data dari satu jenis ke tipe data lainnya.
### Jenis casting
- Upcasting : proses mengubah objek dari kelas turunan ke kelas induk. 
- Downcasting : proses mengubah objek dari kelas induk ke kelas turunan. 
### Berikut source code dari casting
<pre> 
  public static void main(String[] args) {
        PerangkatElektronik laptop = (PerangkatElektronik) samsung;//ini casting
        laptop.setNama("acer");
        laptop.setTahunProduksi(2005);
        System.out.println("ini casting");
        System.out.println("nama laptop " + laptop.getNama()+ " tahun produksi laptop " + laptop.getTahunProduksi());
    }
</pre>
Disini kita melakukan casting jenis *downcasting*, dimana terdapat proses mengubah objek dari kelas induk ke kelas turunan. Pada code ini kita melakukan casting dari objek samsung ke tipe PerangkatElektronik. Ini berarti kita menganggap bahwa samsung adalah objek yang bisa diperlakukan sebagai PerangkatElektronik. Casting ini dilakukan karena samsung adalah objek dari kelas yang merupakan turunan dari PerangkatElektronik yaitu kelas laptop.

---
## 🛠️ Constructor 
Constructor adalah metode khusus dalam Java yang digunakan untuk menginisialisasi objek saat dibuat. Constructor memiliki nama yang sama dengan nama kelas dan tidak memiliki tipe pengembalian. Constructor sangat penting dalam pemrograman berorientasi objek karena memungkinkan untuk menetapkan nilai awal untuk atribut objek.
### Jenis constructor
- Constructor Default : constructor yang tidak memiliki parameter. Jika kita tidak mendefinisikan constructor dalam kelas, Java secara otomatis menyediakan constructor default.
- Constructor Parameterized : constructor yang menerima parameter untuk menginisialisasi atribut objek dengan nilai tertentu.
### Berikut source code dari constructor
<pre> 
  public class PerangkatElektronik {
    private String nama;
    private int tahunProduksi;
    
public PerangkatElektronik(){
    System.out.println("halo dari perangkat elektronik");
}
</pre>
Ini adalah kelas induk yaitu perangkat elektronik. public PerangkatElektronik() adalah constructor default untuk kelas ini. Constructor ini akan dipanggil secara otomatis ketika kita membuat objek dari kelas PerangkatElektronik. Ketika objek dibuat, constructor ini mencetak pesan "halo dari perangkat elektronik" ke konsol. Ini memberikan indikasi bahwa objek telah berhasil dibuat.

---
## ✨ This
Keyword this dalam Java digunakan untuk merujuk pada objek saat ini. Ini sangat berguna dalam konteks kelas dan metode untuk membedakan antara variabel instance (atribut kelas) 
dan parameter metode atau constructor yang memiliki nama yang sama. This membantu meningkatkan keterbacaan kode dan menghindari kebingungan.
### Penggunaan this
- Membedakan variabel instance dan parameter method yang memiliki 
- Memanggil constructor lain dalam constructor
- Menyampaikan referensi objek saat ini
### Berikut contoh source code dari this
<pre> 
public class Laptop {
  public void model(){
        System.out.println("memiliki model macbook");
    }
    
    public void kumpulanModel(){
        this.model();
    }
</pre>
- public void model() adalah metode yang mencetak pesan "memiliki model macbook" ke utama saat dipanggil. Metode ini tidak menerima parameter dan tidak mengembalikan nilai.
- public void kumpulanModel() adalah metode yang memanggil metode model() menggunakan this.model();.
Keyword this digunakan di sini untuk menunjukkan bahwa kita ingin memanggil metode model() dari objek saat ini.
Dalam konteks ini, meskipun tidak wajib, penggunaan this membantu memperjelas bahwa kita memanggil metode dari objek yang sama.

---

## ⬆️ Super
Keyword super dalam Java digunakan untuk merujuk pada kelas induk (superclass) dari suatu kelas. Ini berguna dalam berbagai situasi, terutama ketika kita ingin mengakses anggota (atribut atau metode) dari kelas induk yang mungkin terhalang oleh anggota dengan nama yang sama di kelas turunan (subclass).
### Penggunaan super
- Mengakses atribut kelas induk
- Mengakses metode kelas induk
- Memanggil constructor kelas induk
### Berikut contoh source code dari super
ini adalah source code kelas induk yang akan di jadikan super pada kelas anak / turunan
<pre>
public class PerangkatElektronik {   
  public void model(){
    System.out.println("bermodel laptop gaming");
}
</pre>
ini adalah source code untuk menggunakan super 
<pre> 
public class Laptop {
  public void kumpulanModel(){
        super.model();
  }
</pre>
super.model(); adalah pernyataan yang digunakan untuk memanggil metode model() dari kelas induk (superclass) dari kelas Laptop.
Artinya, jika kelas Laptop adalah subclass dari kelas PerangkatElektronik yang memiliki metode model(), maka pernyataan ini akan memanggil metode tersebut dari kelas PerangkatElektronik.
Oleh karena itu, jika keyword super di jalankan maka output yang keluar adalah "bermodel laptop gaming"

---
## 📜 Implement
Sebuah class menggunakan keyword implement untuk mengimplementasikan suatu *interface* kedalam suatu class dan mengoverride metode yang di perlukan. 
Sedangkan Interface sendiri adalah class yang hanya mengandung deklarasi method tanpa memiliki implementasi.
### Berikut contoh source code dari implement dengan konsep interface
<pre>
  public interface Belajar {
    public void dibuatBelajar();
}
  public interface Game {
    public void bermainGame();
}
  public interface Menonton {
    public void menontonFilm();
}
</pre>
### Berikut adalah cara mengimplementasikan interface tersebut :
<pre>
  public class Laptop extends PerangkatElektronik implements Belajar, Menonton, Game {
     @Override
    public void menontonFilm() {
        System.out.println("laptop digunakan menonton film");
    }
    @Override
    public void dibuatBelajar() {
        System.out.println("laptop digunakan belajar");
    }
    @Override
    public void bermainGame() {
        System.out.println("laptop digunakan bermain game");
    }
</pre>
 Kelas Laptop mengimplementasikan tiga interface yaitu Belajar, Menonton, dan Game. 
 Ini berarti kelas Laptop harus menyediakan implementasi untuk semua metode yang dideklarasikan dalam ketiga interface tersebut.
 *@Override* menunjukkan bahwa metode ini mengoverride (mengganti) metode dari interface Menonton, Belajar, dan Game.

 ---
 ## 📝 Kesimpulan
 - **Casting** dilakukan untuk pengubahan tipe objek
 - **Constructor** digunakan untuk menginisialisasi objek saat dibuat
 - **This** merujuk pada objek saat ini dan membedakan antara variabel instance dengan parameter
 - **Super** digunakan untuk memanggil method yang ada pada kelas induk
 - **Implements** digunakan untuk menerapkan interface dan mengimplementasikan method dengan cara override
---
## 💡Selamat Belajar menggunakan konsep OOP ini📖

