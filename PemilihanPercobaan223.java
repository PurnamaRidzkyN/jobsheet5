import java.util.Scanner;

public class PemilihanPercobaan223 {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);

        System.out.print("Nialai uas  : ");
        float uas = input00.nextFloat();
        System.out.print("Nilai uts   : ");
        float uts = input00.nextFloat();
        System.out.print("Nilai kuis  : ");
        float kuis = input00.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input00.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message;

        if (80 < total && total <= 100) {
            message = "Nilai huruf  = A\nNilai setara = 4\nKualifikasi sangat baik";
        } else if (73 < total && total <= 80) {
            message = "Nilai huruf  = B+\nNilai setara = 3.5\nKualifikasi lebih dari baik";
        } else if (65 < total && total <= 73) {
            message = "Nilai huruf  = B\nNilai setara = 3\nKualifikasi baik";
        }else if (60 < total&&total<=65) {
            message = "Nilai huruf  = c+\nNilai setara = 2,5\nKualifikasi lebih dari cukup";
        }else if(50 < total&&total <= 60){
            message = "Nilai huruf  = c\nNilai setara = 2\nKualifikasi cukup";
        }else if (39< total&&total<=50){
            message = "Nilai huruf  = D\nNilai setara = 1\nKualifikasi kurang";
        }else if (total<= 39) {
            message = "Nilai huruf  = E\nNilai setara = 0\nKualifikasi gagal";
        }else  
        message = "Nilai tidak terdeteksi "; 

        System.out.println("Nilai akhir = " + total + "\nSehingga:\n" + message);
    }
}
