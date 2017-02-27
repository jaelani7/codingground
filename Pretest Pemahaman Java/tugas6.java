import java.util.Scanner;

public class tugas6{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nilai : ");
        int nilai = scanner.nextInt();
        String hasil = HitungNilai(nilai);
        System.out.println("Nilai yang anda masukan adalah " + nilai + " , " + hasil);
     }
     
     public static String HitungNilai(int x1) {
      int nilai = x1;
      
      String hasil;
      if (nilai <= 60 ){
        hasil = "maaf anda tidak lulus";
      }else{
        hasil = "selamat!! anda lulus ";  
      }
      
      return hasil; 
     }
}
