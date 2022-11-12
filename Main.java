package PBOSesi5;

import java.util.Scanner;

public class Main {
    
    static void batas(){
        System.out.println("===========================");
    }
    static void menu(){
        System.out.println("\tMenu");
        System.out.println("===========================");
        System.out.println("1. Info mahasiswa");
        System.out.println("2. Info dosen");
        System.out.println("3. Menambah nilai kursus");
        System.out.println("4. Tampilkan nilai course");
        System.out.println("5. Tampilkan rata-rata nilai course");
        System.out.println("6. Tambahkan kursus dosen");
        System.out.println("7. Hapus kursus dosen");
        System.out.println("8. Exit");
        System.out.println("");
    }
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nama mahasiswa : ");
        String nama_mahasiswa = sc.next();
        System.out.print("Alamat mahasiswa\t: ");
        String alamat_mahasiswa=sc.next();
        Mahasiswa mahasiswa = new Mahasiswa(nama_mahasiswa, alamat_mahasiswa);
        batas();

        System.out.print("Masukan nama dosen : ");
        String nama_dosen = sc.next();
        System.out.print("Alamat dosen\t: ");
        String alamat_dosen = sc.next();
        Dosen dosen = new Dosen(nama_dosen, alamat_dosen);

        while(true){
            System.out.println("");
            batas();
            menu();
            System.out.print("Input no menu : ");
            int noMenu=sc.nextInt();
            switch(noMenu){
                case 1:
                    System.out.println(mahasiswa);
                    break;
                case 2:
                    System.out.println(dosen);
                    break;
                case 3:
                    System.out.print("Masukan nama kursus : ");
                    String kursus=sc.next();
                    System.out.print("Masukan nilai : ");
                    int nilaiKursus=sc.nextInt();
                    mahasiswa.addCourseGrade(kursus, nilaiKursus);
                    break;
                case 4:
                    mahasiswa.printGrades();
                    break;
                case 5:
                    System.out.println("Rata-rata : "+mahasiswa.getAverageGrade());
                    break;
                case 6:
                    System.out.print("Masukan nama kursus yang akan ditambahkan : ");
                    String tambahKursus=sc.next();
                    dosen.addCourse(tambahKursus);
                    break;
                case 7:
                    System.out.print("Masukan nama kursus yang akan dihapus : ");
                    String hapusKursus=sc.next();
                    dosen.removeCourse(hapusKursus);
                    break;
                case 8:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;
            }
        }
    }
}
