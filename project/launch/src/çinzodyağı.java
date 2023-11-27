import java.util.Scanner;
public class çinzodyağı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double doğum ;
        boolean isError = false ;
        System.out.print("Doğum TARİHİNİZİ GİRİNİZ !:");
        doğum = inp.nextInt();
        double brith = doğum % 12 ;
        System.out.print("ÇİN ZODYAĞI BURCUNUZ : ");
        if (brith==0){
            System.out.println("MAUMUN");
        } else if (brith==1) {
            System.out.println("HOROZ");
        } else if (brith==2) {
            System.out.println("KÖPEK");
        } else if (brith==3) {
            System.out.println("DOMUZ");
        } else if (brith==4) {
            System.out.println("FARE");
        } else if (brith==5) {
            System.out.println("ÖKÜZ");
        } else if (brith==6) {
            System.out.println("KAPLAN");
        } else if (brith==7) {
            System.out.println("TAVŞAN");
        } else if (brith==8) {
            System.out.println("EJDERHA");
        } else if (brith==9) {
            System.out.println("YILAN");
        } else if (brith==10) {
            System.out.println("AT");
        } else if (brith==11) {
            System.out.println("KOYUN");

        }
        System.out.println("*-*-*-*-*-*--*-*--*-*-**-*");


    }
}
