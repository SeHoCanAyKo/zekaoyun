import java.util.Scanner;
import java.util.Random;
public class o2 {
	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		Random rnd = new Random();
        int ilkSayi = 0,islem, ikinciSayi = 0, toplamPuan = 0, sayilarinToplami = 0, girilenCevap = 0, dogruCevapSayisi = 0, yanlisCevapSayisi = 0,sayaç=0;
        char devam = 0;
        System.out.println("Rastgele sayı ile ve yine rastgele bir işlemin yapıldığı küçük bir zeka oyunu");
        System.out.println("*****************************************************************************");
        do
        {
            ilkSayi = rnd.nextInt(10);
            ikinciSayi = rnd.nextInt(10);
            islem = rnd.nextInt(4);
            switch (islem)
            {
                case 1:
                	System.out.println(+ilkSayi+"+"+ikinciSayi+"= ?");
                    sayilarinToplami = ilkSayi + ikinciSayi;
                    break;
                case 2:
                	System.out.println(+ilkSayi+"-"+ikinciSayi+"= ?");
                    sayilarinToplami = ilkSayi - ikinciSayi;
                    break;
                case 3:
                	System.out.println(+ilkSayi+"*"+ikinciSayi+"= ?");
                    sayilarinToplami = ilkSayi * ikinciSayi;
                    break;
                case 4:
                	System.out.println(+ilkSayi+"/"+ikinciSayi+"= ?");
                    sayilarinToplami = ilkSayi / ikinciSayi;
                    break;
            }
            System.out.print("Cevabınız : ");
            girilenCevap = oku.nextInt();
            if (girilenCevap == sayilarinToplami)
            {
            	System.out.print("Tebrikler Bildiniz");
                toplamPuan += 5;
                dogruCevapSayisi += 1;
            }
            else
            {
            	System.out.print("Üzgünüm Bilemediniz");
                toplamPuan -= 3;
                yanlisCevapSayisi += 1;
            }
            System.out.print("Tekrar Oynamak istiyormusunuz(e/E)?");
            devam = oku.next().charAt(devam);
            sayaç++;
        } while (devam == 'E' || devam == 'e');
        System.out.println("******************************************************");
        System.out.println("Toplam Doğru Cevap Sayınız: "+dogruCevapSayisi);
        System.out.println("Yanlış Cevap Sayınız: "+yanlisCevapSayisi);
        System.out.println("Toplamda Almış Olduğunuz Puan: "+toplamPuan);
        System.out.println("Sayaç= "+sayaç);
	}
}
