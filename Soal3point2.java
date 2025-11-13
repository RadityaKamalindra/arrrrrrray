package OneDay.README.thirdbg2;
import java.util.Scanner;

public class Soal3point2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  
        System.out.println("=== PROGRAM PENJUMLAHAN DUA MATRIKS ===");
        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();
        
        int[][] matriks1 = new int[baris][kolom];
        int[][] matriks2 = new int[baris][kolom]; 
        int[][] hasil = new int[baris][kolom];
        
        System.out.println("\n--- Input Matriks Pertama ---");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks1[i][j] = input.nextInt();
            }
        }
        
        System.out.println("\n--- Input Matriks Kedua ---");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks2[i][j] = input.nextInt();
            }
        }
    
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }
        
        System.out.println("\n=== HASIL PENJUMLAHAN ===");
        
        System.out.println("\nMatriks 1:");
        tampilkanMatriks(matriks1, baris, kolom);
        
        System.out.println("\nMatriks 2:");
        tampilkanMatriks(matriks2, baris, kolom);
        
        System.out.println("\nHasil Penjumlahan:");
        tampilkanMatriks(hasil, baris, kolom);
        
        input.close();
    }
    
    public static void tampilkanMatriks(int[][] matriks, int baris, int kolom) {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
