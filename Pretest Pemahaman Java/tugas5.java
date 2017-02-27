import java.util.Scanner;

public class tugas5{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        int x = scanner.nextInt();
        int hasil = HitungMundur(x);
        for (int y = hasil; y>= 1; y--) {
         System.out.println(y);
        }
     }
     
     public static int HitungMundur(int x1) {
      int angka = x1;
      
      return angka; 
     }
}
