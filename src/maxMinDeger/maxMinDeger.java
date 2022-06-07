package maxMinDeger;

import java.util.Scanner;

public class maxMinDeger {

	public static void main(String[] args) {
		// Java ile klavyeden girilen N tane sayma sayısından en büyük 
		//ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

		int sayac,sayi,min=0,max=0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kac sayi gireceksiniz : ");
        sayac = input.nextInt();

        for(int i=1; i<=sayac;i++){
            System.out.print(i + ". Sayiyi giriniz : "  );
            sayi = input.nextInt();

            if (i==1){
                max=sayi;
                min=sayi;
            }else{
                if (sayi>max){
                    max=sayi;
                } else if (sayi<min) {
                    min=sayi;
                }
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
	}

}
