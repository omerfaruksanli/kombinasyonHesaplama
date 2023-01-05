import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n,r,kombinasyon,nfac=1,rfac=1,facnr = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk değeri giriniz : ");
        n = input.nextInt();
        System.out.print("İkinci değeri giriniz : ");
        r = input.nextInt();

        for (int i = 1 ;  i <= n; i++){
            nfac *=i;

        }
        for (int i = 1; i <= r; i++){
            rfac *=i;
        }
        for (int i = 1; i<=(n-r);i++ ){
            facnr*=i;
        }
        kombinasyon= nfac/(rfac*facnr);
        System.out.println("Kombinasyon : " + kombinasyon);
         if(r>=n){
             System.out.println("Hatalı Giriş Yaptınız !");
         }

    }
}