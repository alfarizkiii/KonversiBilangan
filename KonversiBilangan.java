package aok;
//M.Naufal Al Farizki
//235150207111032
//TIF - C
import java.util.Scanner;
public class KonversiBilangan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;
        System.out.println("Mengonversikan Bilangan");
        System.out.println("1. Desimal");
        System.out.println("2. Biner");
        System.out.println("3. Hexadesimal");
        System.out.print("jenis bilangan yang ingin diubah (1-3) : ");
        pilih = in.nextInt();
        System.out.println("============================");
        
        switch (pilih){
            case 1 : {
                int pilih2;
                System.out.println("1. Desimal ke Biner");
                System.out.println("2. Desimal ke Hexadesimal");
                System.out.print("Pilihan anda : ");
                pilih2=in.nextInt();
                System.out.println("============================");
                if(pilih2==1){
                    int a;
                    System.out.print("Masukkan bilangan desimal : ");
                    a=in.nextInt();
                    String biner = Integer.toBinaryString(a);
                    System.out.println("Hasil konversi bilangan desimal ke bilangan biner adalah : " + biner);
                    System.out.println("============================");
                }
                if(pilih2==2){
                     int a;
                     System.out.print("Masukkan bilangan desimal : ");
                     a = in.nextInt();
                     String hexa = Integer.toHexString(a);
                     System.out.println("Hasil konversi bilangan desimal ke bilangan hexadesimal adalah : " + hexa);
                     System.out.println("============================");
                }
            }
            break;
            
            case 2 : {
                int pilih2;
                System.out.println("1. Biner ke Desimal");
                System.out.println("2. Biner ke Hexadesimal");
                System.out.print("Pilihan anda : ");
                pilih2 = in.nextInt();
                System.out.println("============================");
                if (pilih2==1){
                    String biner;
                    System.out.print("Masukkan Bilangan Biner : ");
                    biner = in.next();
                    int a = Integer.parseInt(biner,2);
                    System.out.println("Hasil Konversi bilangan biner ke bilangan desimal adalah : " +a);
                    System.out.println("============================");
                }
                if (pilih2==2){
                     String biner;
                     System.out.print("Masukkan Bilangan Biner : ");
                     biner = in.next();
                     int a = Integer.parseInt(biner,2);
                     String hexa = Integer.toHexString(a);
                     System.out.println("Hasil Konversi bilangan biner ke bilangan hexadesimal adalah : " + hexa);
                     System.out.println("============================");
                }
            }
            break;
            case 3 : {
                int pilih4;
                System.out.println("1. Hexadesimal ke Desimal");
                System.out.println("2. Hexadesimal ke Biner");
                System.out.print("Pilihan anda : ");
                pilih4 = in.nextInt();
                System.out.println("============================");
                if(pilih4==1){
                    String hexa;
                    System.out.print("Masukkan Bilangan Hexadesimal : ");
                    hexa = in.next();
                    int a = Integer.parseInt(hexa,16);
                    System.out.println("Hasil Konversi bilangan hexadesimal ke bilangan desimal adalah : " +a);
                    System.out.println("============================");
                }
                if(pilih4==2){
                    String hexa;
                    System.out.print("Masukkan Bilangan Hexadesimal : ");
                    hexa = in.next();
                    int a = Integer.parseInt(hexa,16);
                    String biner = Integer.toBinaryString(a);
                    System.out.println("Hasil Konversi bilangan hexadesimal ke bilangan biner adalah : " +biner);
                    System.out.println("============================");
                }
            }
            break;
            default : {
                System.out.println("Pilihan anda tidak tersedia");
                System.out.println("============================");
            }
        }
    }

}
//source : https://youtu.be/mrRlGF1AJtg?si=0IRjHzZKG7dglzIM//
//source : https://youtube.com/shorts/szyVcUP53jA?si=DZVGB7vRhhDsrRe_//