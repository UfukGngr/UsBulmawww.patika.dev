import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k,total=1;

        Scanner scan=new Scanner(System.in);
        System.out.print("Üs alınmasını istediğiniz sayıyı girin: ");
        n=scan.nextInt();

        System.out.print("Üssü girin: ");
        k=scan.nextInt();

        for(int i=0; i<k; i++){
            total*=n;

        }
        System.out.println("Cevap: "+ total);
    }
}