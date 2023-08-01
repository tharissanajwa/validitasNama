import java.util.Scanner;

public class ValiditasNamaPengguna {
    public static void validasiUsername() {

        Scanner scanner = new Scanner(System.in); // mengambil class scanner agar bisa dijalankan

        System.out.println("Selamat datang di Program Pengecekan Validitas Nama Pengguna!"); // output selamat datang

        boolean lanjut = true; // untuk menyimpan variabel lanjut
        while (lanjut) { // untuk mengecek bila lanjut bernilai true maka akan terjadi looping, sebaliknya jika false program akan diselesaikan
            boolean validInput = false; // untuk menyimpan variabel validasi inputan username
            while (!validInput) { // untuk mengecek bila validInput bernilai false maka akan terjadi looping, sebaliknya jika true program akan diselesaikan
                System.out.print("Masukkan nama pengguna (username): ");
                String username = scanner.nextLine(); // untuk memberikan akses input pengguna

                if ((username.length() >= 5) && (username.length() <= 12)) { // untuk mengecek apakah inputan pengguna terdiri dari 5-12 karakter
                    if (!username.matches("^[a-zA-Z].*")) { // untuk mengecek apakah inputan pengguna dimulai dengan huruf
//                    if (!Character.isLetter(username.charAt(0))) { kodingan yang seperti ini juga bisa untuk mengecek karakter pertama nya harus berupa huruf:)
                        System.out.println("Maaf, nama pengguna harus dimulai dengan huruf.");
                    } else if (!username.matches("^[a-zA-Z0-9]+$")) { // untuk mengecek apakah inputan pengguna hanya berupa huruf dan angka
                        System.out.println("Maaf, nama pengguna hanya boleh menggunakan huruf dan angka.");
                    } else { // jika semua kondisi sebelumnya tidak terpenuhi, maka pengecekan username berhasil
                        System.out.println("Selamat, nama pengguna valid!");
                        validInput = true; // untuk menyelesaikan looping validasi input
                    }
                } else { // pesan kesalahan bila inputan tidak terdiri dari 5-12 karakter
                    System.out.println("Maaf, nama pengguna harus terdiri dari 5 hingga 12 karakter.");
                }
            }

            // meminta pengguna untuk menjalankan pengecekan username kembali atau tidak
            System.out.print("Apakah pengecekan username ingin dijalankan kembali? (ya/tidak) : ");
            String isRunning = scanner.next();

            if (isRunning.equalsIgnoreCase("ya")) {
                // jika pengguna ingin menjalankan pengecekan username kembali, program akan terus berjalan kembali pada inputan username diatas
                System.out.println("=================================================================================");
                System.out.println("Pengecekan Selanjutnya");
                scanner.nextLine(); // fungsinya agar kembali pada inputan username
            } else if (isRunning.equalsIgnoreCase("tidak")) {
                // jika pengguna tidak ingin menjalankan pengecekan username kembali, program akan selesai
                System.out.println("Terimakasih! Pengecekan Username Telah Selesai.");
                System.out.println("=================================================================================");
                lanjut = false; // fungsinya agar program selesai dilakukan, tidak usah melakukan loop lanjut kembali
            } else {
                // jika pengguna memasukkan input selain "ya" atau "tidak", program akan selesai
                System.out.println("Input salah, format harus berupa ya/tidak. Silahkan refresh kembali.");
                System.out.println("=================================================================================");
                lanjut = false; // fungsinya agar program selesai dilakukan, tidak usah melakukan loop lanjut kembali
            }
        }

        scanner.close(); // untuk menutup scanner agar tidak berjalan terus-terusan
    }
}