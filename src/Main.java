import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz: ");
        double a = input.nextDouble();
        System.out.print("İkinci Sayıyı Giriniz: ");
        double b = input.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        System.out.print("Seçiniz : ");
        int select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Sonuç : "+(a+b));
                break;
            case 2:
                System.out.println("Sonuç : "+(a-b));
                break;
            case 3:
                System.out.println("Sonuç : "+(a/b));
                break;
            case 4:
                System.out.println("Sonuç : "+(a*b));
                break;
            default:
                System.out.println("Seçilen İşlem Yanlış!!!");
        }
    }
}





