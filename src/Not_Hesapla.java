import java.util.Scanner;
public class Not_Hesapla {
    public static void main(String[] args) {

        int mat,fiz,kim,tar,tr,mzk ;
        double tot,avg;
        Scanner inp=new Scanner(System.in);


        System.out.println("Matematik Notunuzu Giriniz: ");
        mat= inp.nextInt();

        System.out.println("Fizik Notunuzu Giriniz : ");
        fiz= inp.nextInt();

        System.out.println("Kimya Notunuzu Giriniz : ");
        kim=inp.nextInt();

        System.out.println("Tarih Notunuzu Giriniz : ");
        tar= inp.nextInt();

        System.out.println("Türkçe Notunuzu Girniz : ");
        tr= inp.nextInt();

        System.out.println("Müzik notunuzu griniz : ");
        mzk= inp.nextInt();

        tot=mat+fiz+kim+tar+tr+mzk;

        avg=tot/6;

        System.out.println("Not ortalamanız : " + avg);

        System.out.println(avg>=60 ? "Sınıfı Geçti " : "Sınıfta Kaldı");




    }
}
