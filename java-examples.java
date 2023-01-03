// Klavyeden Girilen Sayının Tam Bölenlerini Bulan ve Ekranda Listeleyen, Aynı Zamanda Tam Bölenlerin Sayısını da Ekrana Yazdıran Kod
	
public static void main(String[] args)
{
	Scanner klavye = new Scanner(System.in);
		
	System.out.println("Sayı Giriniz : ");
	int sayi = klavye.nextInt();
		
	int adet = 0;
		
	for(int i = 1; i <= sayi; i++) 
	{
		if(sayi % i == 0)
		{
			System.out.println(i);
			adet++;
		}
	}
		
	System.out.println("Tam Bölenlerin Sayısı : " + adet);
}

// Klavyeden Girilen İki Sayı Arasındaki Çift Sayıları Yazdıran ve Bu Çift Sayıların Adetini ve Toplamını Bularak Ekrana Yazdıran Kod

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    System.out.println("1. Sayı : ");
    int ilkSayi = klavye.nextInt();

    System.out.println("2. Sayı : ");
    int ikinciSayi = klavye.nextInt();

    int adet = 0;
    int toplam = 0;

    for(int i = ilkSayi; i <= ikinciSayi; i++)
    {
        if(i % 2 == 0)
        {
            System.out.println(i);
            adet++;
            toplam += i;
        }
    }

    System.out.println("Çift Sayı Adeti : " + adet);
    System.out.println("Çift Sayıların Toplamı : " + toplam);
}

// 20 Satır 100 Sütundan Oluşan İki Boyutlu Sayısal Diziye 0 - 100 Arasında Rastgele Sayılardan Değer Atanacaktır. Değer Atandıktan Sonra Her Bir Satırdaki Elemanların Toplamını Bulup Ekrana Yazandıran Kod

public static void main(String[] args)
{
    Random rastgele = new Random();
    
    int[][] dizi = new int[20][100];

    for(int i = 0; i < dizi.length; i++)
    {
        for(int j = 0; j < dizi[i].length; j++)
        {
            dizi[i][j] = rastgele.nextInt(101);
        }
    }

    for(int i = 0; i < dizi.length; i++)
    {
        int toplam = 0;

        for(int j = 0; j < dizi[i].length; j++)
        {
            toplam += dizi[i][j];
        }

        System.out.println(i + 1 + ". Satır Elemanlarının Toplamı : " + toplam);
    }
}

// Verilen Bir Kişi Adını Dizide Arayan ve Bulunup Bulunmadığını Belirten Kod

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    String[] dizi = {"Ali", "Veli", "Ahmet", "Mehmet", "Ayşe", "Fatma"};

    System.out.println("Aranacak İsim : ");
    String aranacakIsim = klavye.nextLine();

    boolean bulundu = false;

    for(String isim : dizi)
    {
        if(isim.equals(aranacakIsim))
        {
            bulundu = true;
            break;
        }
    }

    if(bulundu)
    {
        System.out.println("İsim Bulundu");
    }

    else
    {
        System.out.println("İsim Bulunamadı");
    }
}

// Verilen Bir String Dizisini Ters Sırada Listeleme

public static void main(String[] args)
{
    String[] dizi = {"Ali", "Veli", "Ahmet", "Mehmet", "Ayşe", "Fatma"};

    System.out.println("Dizi Elemanları : ");

    for(int i = dizi.length - 1; i >= 0; i--)
    {
        System.out.println(dizi[i]);
    } 
}

// Klavyeden Negatif Sayı Girilene Kadar Girdiği Sayıları Toplama

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    int toplam = 0;

    while(true)
    {
        System.out.println("Bir Sayı Giriniz (Negatif Sayı Girdiğinizde Program Sonlanır) : ");
        int sayi = klavye.nextInt();

        if(sayi < 0)
        {
            break;
        }

        toplam += sayi;
    }

    System.out.println("Toplam : " + toplam);
}

// Klavyeden Girilen Fiyat Değerine Göre %18 KDV Ekleyip KDV'li Fiyatını Bulan ve Ekrana Yazdıran Kod

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    System.out.println("Fiyat : ");
    double fiyat = klavye.nextDouble();

    double kdv = fiyat * 0.18;
    double kdvliFiyat = fiyat + kdv;

    System.out.println("KDV'li Fiyat : " + kdvliFiyat + "₺");
}

// Fiyatı ve KDV Oranı Klavyeden Girilen Ürünün Tuturını Hesaplama

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    System.out.println("Fiyat : ");
    double fiyat = klavye.nextDouble();

    System.out.println("KDV Oranı (%) : ");
    double kdvOrani = klavye.nextDouble();

    double kdv = fiyat * (kdvOrani / 100);
    double kdvliFiyat = fiyat + kdv;

    System.out.println("KDV : " + kdv);
    System.out.println("KDV'li Fiyat : " + kdvliFiyat);
}

// Kullanıcıya Kaç Tane Sayıyı Toplayacağını Sorup, Toplanacak Sayı Kadar Tek Tek Soran ve Kullanıcının Yazdığı Bu Sayıların Toplamını Ekrana Yazdıran Kod

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    System.out.println("Kaç Sayı Toplayacaksınız? : ");
    int adet = klavye.nextInt();

    int toplam = 0;

    for(int i = 1; i <= adet; i++)
    {
        System.out.println(i + ". Sayıyı Giriniz : ");
        int sayi = klavye.nextInt();
        toplam += sayi;
    }

    System.out.println("Toplam : " + toplam);
}

// Rastgele Sayılar İle Dizi Elemanlarını Oluşturma

public static void main(String[] args)
{
    Random rastgele = new Random();
    int[] dizi = new int[5];

    for(int i = 0; i < dizi.length; i++)
    {
        dizi[i] = rastgele.nextInt(100);
    }

    System.out.println("Dizi Elemanları : ");

    for(int eleman : dizi)
    {
        System.out.println(eleman);
    }
}

// Klavyeden Girilen Bir Sayının Seçime Bağlı Olarak; Karesini, Küpünü ve Karekökünü Alan Program

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    System.out.println("Bir Sayı Giriniz : ");
    int sayi = klavye.nextInt();

    System.out.println("1 - Kare");
    System.out.println("2 - Küp");
    System.out.println("3 - Karekök");

    System.out.println("Seçiminiz : ");
    int secim = klavye.nextInt();

    if(secim == 1)
    {
        System.out.println(sayi + " Sayısının Karesi : " + (sayi * sayi));
    }

    else if(secim == 2)
    {
        System.out.println(sayi + " Sayısının Küpü : " + (sayi * sayi * sayi));
    }

    else if(secim == 3)
    {
        System.out.println(sayi + " Sayısının Karekökü : " + Math.sqrt(sayi));
    }

    else
    {
        System.out.println("Geçersiz İşlem");
    }
}

// Klavyeden Girilen 10 Adet Sayıdan En Büyük ve En Küçük Olanı Bulma

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    int max = Integer.MIN_VALUE;

    int min = Integer.MAX_VALUE;

    for(int i = 1; i <= 10; i++)
    {
        System.out.println("Bir Sayı Giriniz : ");
        int sayi = klavye.nextInt();

        if(sayi > max)
        {
            max = sayi;
        }

        if(sayi < min)
        {
            min = sayi;
        }
    }

    System.out.println("En Büyük Sayı : " + max);

    System.out.println("En Küçük Sayı : " + min);
}

// 1'den 100'e Kadar Olan Sayılardan 5'e Bölünenlerin Sayısını Bulma

public static void main(String[] args)
{
    int sayi = 0;

    for(int i = 1; i <= 100; i++)
    {
        if(i % 5 == 0)
        {
            sayi++;
            System.out.println(i); // Eğer hangi sayılar olduğunu merak ediyorsanız bunu ekleyebilirsiniz
        }
    }

    System.out.println("1'den 100'e Kadar Olan Sayılar Arasından 5 İle Bölünebilenlerin Sayısı : " + sayi);
}

// Yukarıdaki Örneğin Dışardan Girilmesi Durumu

public static void main(String[] args) 
{
    Scanner klavye = new Scanner(System.in);
    
    System.out.print("Lütfen başlangıç sayısını girin: ");
    int baslangic = klavye.nextInt();
    
    System.out.print("Lütfen bitiş sayısını girin: ");
    int bitis = klavye.nextInt();
    
    int sayi = 0;

    for(int i = baslangic; i <= bitis; i++)
    {
        if(i % 5 == 0)
        {
            System.out.println(i);
            sayi++;
        }
    }

    System.out.println("Başlangıç Sayısı : " + baslangic + ", Bitiş Sayısı : " + bitis + " Arasında " + sayi + " Tane 5'e Tam Bölünebilen Sayı Vardır");
}

// Klavyeden Girilen Bir Sayıya Kadar Tek Sayıların ve Çift Sayıların Toplamını Bulma

public static void main(String[] args) 
{
    Scanner klavye = new Scanner(System.in);

    System.out.println("Bir Sayı Giriniz : ");
    int sayi = klavye.nextInt();

    int ciftToplam = 0;
    int tekToplam = 0;

    for(int i = 1; i <= sayi; i++)
    {
        if(i % 2 == 0)
        {
            ciftToplam += i;
        }

        else
        {
            tekToplam += i;
        }
    }

    System.out.println("Çift Sayıların Toplamı : " + ciftToplam);
    System.out.print("Tek Sayıların Toplamı : " + tekToplam);
}

// 0'dan 100'e Kadar Olan Sayıların Toplamı

public static void main(String[] args)
{
    int toplam = 0;

    for(int i = 0; i < 10; i++)
    {
        toplam += i;
    }

    System.out.println("Sayıların Toplamı : " + toplam);
}

// 2 Tane Sayı İstenerek 1. Sayının 2. Sayıya Tam Bölünmesi Durumunda "Tam Bölünüyor" Yazan, Aksi Durumda "Tam Bölünmüyor" Yazarak Kalanı Ekrana Yazdırma

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    System.out.println("Birinici Sayıyı Giriniz : ");
    int sayi1 = klavye.nextInt();

    System.out.println("İkinci Sayıyı Giriniz : ");
    int sayi2 = klavye.nextInt();

    if(sayi1 % sayi2 == 0)
    {
        System.out.println("Tam Bölünüyor");
    }

    else
    {
        System.out.println("Tam Bölünmüyor");
        int kalan = sayi % sayi2;
        System.out.println("Kalan : " + kalan);
    }
}

// 4 İşlem

public static void main(String[] args)
{
	Scanner klavye = new Scanner(System.in);

	System.out.println("Birinici Sayıyı Giriniz : ");
	int sayi1 = klavye.nextInt();

	System.out.println("İkinci Sayıyı Giriniz : ");
	int sayi2 = klavye.nextInt();

	System.out.println("İşlem Seçiniz | + | - | * | / | : ");
	char islem = klavye.next().charAt(0);

	int sonuc;

	if(islem == '+')
	{
	    sonuc = sayi1 + sayi2;
	}

	else if(islem == '-')
	{
	    sonuc = sayi1 - sayi2;
	}

	else if(islem == '*')
	{
	    sonuc = sayi1 * sayi2;
	}

	else if(islem == '/')
	{
	    sonuc = sayi1 / sayi2;
	}

	else
	{
	    System.out.println("Geçersiz İşlem");
	    return;
	}

	System.out.println(sayi1 + " " + islem + " " + sayi2 + " : " + sonuc);
}

// Girilen Sayı Çift İse Yarsını, Tek İse 2 Katını Alarak Ekrana Yazma

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    System.out.println("Bir Sayı Girin : ");
    int sayi = klavye.nextInt();

    if(sayi % 2 == 0)
    {
        int yarisi = sayi / 2;
        System.out.println(sayi + " Sayısının Yarısı : " + yarisi);
    }

    else
    {
        int ikiKati = sayi * 2;
        System.out.println(sayi + " Sayısının 2 Katı : " + ikiKati);
    }
}

// Klavyeden Girilen 3 Sayıyı Ekrana Yazma

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    System.out.println("1. Sayı : ");
    int sayi1 = klavye.nextInt();

    System.out.println("2. Sayı : ");
    int sayi2 = klavye.nextInt();

    System.out.println("3. Sayı : ");
    int sayi3 = klavye.nextInt();

    System.out.println(+ sayi1 + " " + sayi2 + " " + sayi3);
}

// Klavyeden Girilen Yaş Eğer 18 ve Daha Büyükse; "Ehliyet Alabilirsiniz" Değilse, "Alamazsınız" Gibi Diyerek Kaç Yılı Kaldığını Gösteren Kod

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    System.out.println("Yaşınızı Giriniz : ");
    int yas = klavye.nextInt();

    if(yas >= 18)
    {
        System.out.println("Ehliyet Alabilirsiniz");
    }

    else
    {
        int kalanYil = 18 - yas;
        System.out.println("Ehliyet Alamazsınız. Ehliyet Alabilmek İçin " + kalanyil + " Yılınız Kaldı");
    }
}

// Faktoriyel Hesaplama

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    System.out.println("Sayı Giriniz : ");
    int sayi = klavye.nextInt();

    long faktoriyel = 1;

    for(int i = 1; i <= sayi; i++)
    {
        faktoriyel *= i;
    }

    System.out.println(sayi + "! : " + faktoriyel);
}

// Klavyeden Girilen 3 Sayıdan En Büyüğünü Bulma

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    System.out.println("1. Sayı : ");
    int sayi1 = klavye.nextInt();
    
    System.out.println("2. Sayı : ");
    int sayi2 = klavye.nextInt();

    System.out.println("3. Sayı : ");
    int sayi3 = klavye.nextInt();

    int enBuyukSayi = sayi1;

    if(sayi2 > enBuyukSayi)
    {
        enBuyukSayi = sayi2;
    }

    if(sayi3 > enBuyukSayi)
    {
        enBuyukSayi = sayi3;
    }

    System.out.println("En Büyük Sayı : " + enBuyukSayi);
}

// Klavyeden Girilen 10 Elemanlı Bir Dizinin Elemanlarını %10 Arttırarak Ekrana Yazma

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    double[] dizi = new double[10];

    for(int i = 0; i < 10; i++)
    {
        System.out.println("Dizinin " + (i+1) + ". Elemanını Giriniz : ");

        dizi[i] = klavye.nextDouble();
    }

    for(int i = 0; i < 10; i++)
    {
        dizi[i] = dizi[i] + (dizi[i] * 0.1);

        System.out.println((i+1) + ". Eleman : " + dizi[i]);
    }
}

// Klavyeden Girilen Metnin Kaç Kelimeden Oluştuğunu Bulma

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    System.out.println("Cümle Giriniz : ");
    String cumle = klavye.nextLine();

    String[] kelimeler = cumle.split("\\s+");
    int kelimeSayisi = kelimeler.length;

    System.out.println("Cümlede " + kelimeSayisi + " Kelime Var");
}

// Maaşı ve Zamı Girilen İşçinin Zamlı Maaşını Bulma

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    System.out.println("Maaş : ");
    double maas = klavye.nextDouble();

    System.out.println("Zam Oranı (%) : ");
    double zamOrani = klavye.nextDouble();

    double zamliMaas = maas * (1 + zamOrani / 100);

    System.out.println("Zamlı Maaş : " + zamliMaas + "₺");
}

// Klavyeden Girilen 3 Sayıdan En Büyük ve En Küçüğünü Toplayıp Ekrana Yazma

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    System.out.println("1. Sayı : ");
    int sayi1 = klavye.nextInt();

    System.out.println("2. Sayı : ");
    int sayi2 = klavye.nextInt();

    System.out.println("3. Sayı : ");
    int sayi3 = klavye.nextInt();

    int max = Math.max(sayi1, Math.max(sayi2, sayi3));
    int min = Math.min(sayi1, Math.min(sayi2, sayi3));

    int toplam = max + min;

    System.out.println("Küçük Sayı : " + min + " \nBüyük Sayı : " + max + " \nToplam : " + toplam);
}

// Kullanıcı Giriş Paneli

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    System.out.println("Kullanıcı Adı : ");
    String kadi = klavye.nextLine();

    System.out.println("Şifre : ");
    String sifre = klavye.nextLine();

    if(kadi.equals("admin") && sifre.equals("123"))
    {
        System.out.println("Giriş Başarılı");
    }

    else
    {
        System.out.println("Kullanıcı Adı veya Şifre Yanlış");
    }
}

// 1'den 10'a Kadar Rastgele 3 Sayı Üretip Bu Sayılardan En Büyüğünü Ekrana Yazma

public static void main(String[] args)
{
    Random rastgele = new Random();

    int sayi1 = rastgele.nextInt(10) + 1;

    int sayi2 = rastgele.nextInt(10) + 1;

    int sayi3 = rastgele.nextInt(10) + 1;

    int enBuyukSayi = Math.max(sayi1, Math.max(sayi2, sayi3));

    System.out.println("Üretilen Sayılar : " + sayi1 + " | " + sayi2 + " | " + sayi3);

    System.out.println("En Büyük Sayi : " + enBuyukSayi);
}

// Girilen Metni Ters Yazdırma (Metodla)

public static String tersYaz(String metin)
{
    String sonuc = "";

    for(int i = metin.length()-1; i >= 0; i--)
    {
        sonuc += metin.charAt(i);
    }

    return sonuc;
}

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    System.out.println("Metni Giriniz : ");
    String metin = klavye.nextLine();

    System.out.println(tersYaz(metin));
}

// Üssünü Bulma

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    System.out.println("Sayı Giriniz : ");
    int sayi = klavye.nextInt();

    System.out.println("Üs Değerini Giriniz : ");
    int us = klavye.nextInt();

    int usDegeri = (int) Math.pow(sayi, us);

    System.out.println("Girilen Sayının " + us + " Üssü : " + usDegeri);
}

// Mutlak Değer Bulma

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    System.out.println("Sayı Giriniz : ");
    int sayi = klavye.nextInt();

    int mutlakDeger = Math.abs(sayi);

    System.out.println("Girilen Sayının Mutlak Değeri : " + mutlakDeger);
}

// Karekök Bulma

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    System.out.println("Sayı Giriniz : ");
    double sayi = klavye.nextInt();

    double kareKok = Math.sqrt(sayi);

    System.out.println("Girilen Sayının Kare Kökü : " + kareKok);
}

// Klavyeden Dizi Boyutu Girilecek. Daha Sonra Diziye Rastgele Değerler Atanacak ve Atanmış Değerleri Ekrana Yazdıracak

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    System.out.println("Dizi Boyutunu Giriniz : ");

    int diziBoyutu = klavye.nextInt();

    int dizi[] = new int[diziBoyutu];

    for(int i = 0; i < diziBoyutu; i++)
    {
        double sayi = Math.random();

        int randomSayi = (int) (sayi * 100);

        dizi[i] = randomSayi;
    }

    for(int i = 0; i < diziBoyutu; i++)
    {
        System.out.println("Dizinin " + i + ". Elemanı : " + dizi[i]);
    }
}

// Girilen Metinde Kelimeleri Virgülden Ayırap 10 Kere Rastgele Yazdıracak ve Bunların Kaçıncı INDEX Üzerinde Olduğunu Bulacak Kod (Metodla)

public static void main(String[] args)
{
    String metin = "Ali, Veli, Ahmet, Mehmet, Ayşe, Fatma";
    parcala(metin, ",");
}

public static void parcala(String metin, String ng)
{
    String[] dizi = metin.split(ng);

    Random rastgele = new Random();

    for(int i = 0; i < 10; i++)
    {
        int sayi = rastgele.nextInt(0,dizi.length);
        System.out.println(sayi);
        System.out.println(dizi[sayi]);
    }
}

// Klavyeden Girilen Sayı 10'dan Büyükse Tekrar Sayı İstenecek Küçükse de Girilen Sayıyı 2 İle Çarpıp Ekrana Yazacak

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    int sayi;
    
    while(true)
    {
        System.out.println("Bir Sayı Giriniz : ");
        sayi = klavye.nextInt();

        if(sayi <= 10)
        {
            break;
        }
    }

    int sonuc = sayi * 2;

    System.out.println("Sonuç : " + sonuc);
}

// Tek mi Çift mi (Metodla)

public static void main(String[] args)
{
    tekmiCiftmi();
}

public static void tekmiCiftmi()
{
    Scanner klavye = new Scanner(System.in);

    int sayi;

    System.out.println("Bir Sayı Giriniz : ");
    sayi = klavye.nextInt();

    if(sayi % 2 == 0)
    {
        System.out.println(sayi + " Sayısı Çifttir");
    }

    else
    {
        System.out.println(sayi + " Sayısı Tekir");
    }
}

// Girilen Metni Virgüllerden Ayıran Kod

public static void main(String[] args)
{
    String yazi = ("Ali,Veli,Ahmet,Mehmet");

    parcala(yazi);
}

public static void parcala(String yazi)
{
    String[] dizi = yazi.split(",");

    for(int i = 0; i < dizi.length; i++)
    {
        System.out.println(dizi[i]);
    }
}

// Girilen Sayı Asal mı Değil mi

public static void main(String[] args)
{
    int sayac = 0;

    System.out.println("Sayı Giriniz : ");
    Scanner klavye = new Scanner(System.in);
    int sayi = klavye.nextInt();

    for(int i = 1; i <= sayi; i++)
    {
        if(sayi % i == 0)
        {
            sayac++;
        }
    }

    if(sayac == 2)
    {
        System.out.println(sayi + " Sayısı Asal Sayıdır");
    }

    else
    {
        System.out.println(sayi + " Sayısı Asal Sayı Değildir");
    }
}

// Sürekli INT Girdi İsteyecek. Bunları Toplayacak 100'den Büyük Bir Sayı Girildiğinde Bu Sayı Dahil Toplamı Yazdırıp Döngü Bitecek

public static void main(String[] args)
{
    Scanner klavye = new Scanner(System.in);

    int sayi;
    int toplam = 0;

    while(true)
    {
        System.out.println("Sayı Giriniz : ");
        sayi = klavye.nextInt();

        toplam = toplam + sayi;

        if(sayi > 100)
        {
            System.out.println("Girilen Sayıların Toplamı : " + toplam);
            break;
        }
    }  
}

// 1'den 50'ye Kadar Olan Sayılardan 5'in Katı Olmayanları Yazan Kod

public static void main(String[] args)
{
    int sayi = 0;

    while(sayi < 50)
    {
        sayi++;

        if(sayi % 5 == 0)
        {
            continue;
        }

        System.out.println("5'in Katı Olmayan Sayı Tespit Edildi : " + sayi);
    }
}
