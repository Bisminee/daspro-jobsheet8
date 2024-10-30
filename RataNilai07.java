import java.util.Scanner;
public class RataNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, rataNilai;
        int nilaiMhs, i = 1;


        while (i <= 5){
            System.out.println("Masukkan nilai mahasiswa ke-" + i);
            double totalNilai = 0;
            for(int j = 1; j <= 5; j++){
                System.out.print("Nilai ke-" + j + " = ");
                nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            }
            rataNilai = totalNilai/5;
            System.out.println("Rata-rata nilai mahasiswa ke-" + i + " = " + rataNilai + "\n");
            i++;
        }
    }
    
}
