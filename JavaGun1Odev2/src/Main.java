
public class Main {

	public static void main(String[] args) {

		// SWITCH DEMO

		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;

		case 'B':
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;

		case 'D':
			System.out.println("Fena Değil: Geçtiniz");
			break;

		case 'F':
			System.out.println("Maalesef : Kaldınız");
			break;

		default:
			System.out.println("Geçersiz not girdiniz");
		}

		// LOOP DEMO

		for (int i = 2; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti");

		// While
		int k = 1;
		while (k < 10) {
			System.out.println(k);
			k++;
		}
		System.out.println("While döngüsü bitti");

		// Do-While
		int l = 1;
		do {
			System.out.println(l);
			l += 2;
		} while (l < 10);
		System.out.println("do-While döngüsü bitti");
		while (k < 10) {
			System.out.println(k);
			k++;
		}
		System.out.println("While döngüsü bitti");

		// Do-While
		do {
			System.out.println(l);
			l += 2;
		} while (l < 15);
		System.out.println("do-While döngüsü bitti");

		// ARRAY DEMO

		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Ahmet";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("-------------------------------------------");

		String[] ogrenciler = new String[5];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";
		// ogrenciler[4] = "Ali";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("-------------------------------------------");

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

		// ReCap DEMO

		double[] myList = { 1.2, 1.3, 4.3, 5.6 };
		double total = 0;
		double max = myList[0];

		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam : " + total);
		System.out.println("En büyük : " + max);

		// MULTI DIMENSIONAL ARRAY DEMO

		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakır";
		sehirler[2][1] = "Şanlıurfa";
		sehirler[2][2] = "Gaziantep";

		for (int i = 0; i <= 2; i++) {
			System.out.println("-----------------------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(sehirler[i][j]);
			}
		}

		// STRING DEMO

		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		System.out.println("Eleman Sayısı : " + mesaj.length());

		System.out.println("5. eleman : " + mesaj.charAt(4));

		// Mesajın sonunu başka bir mesajla birleştirmemizi sağlar (concat:birleştirmek)
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj);

		// Mesajın hangi harfle başladığını sorar. A ile başlıyorsa True A ile
		// başlamıyorsa false döndürür.
		// Büyük küçük harf true false etkiler
		System.out.println(mesaj.startsWith("A"));
		// Mesajın ne ile bittiğini sorar
		System.out.println(mesaj.endsWith("."));

		// mesajın içindeki karakterleri çeker. biz Bugün kelimesini çektik aşağıdaki
		// örnekte
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);

		// verilen karakterin soldan başlayarak kaçıncı eleman olduğunu söyler
		System.out.println(mesaj.indexOf('a'));
		// verilen karakterin sağdan başlayarak arar ve soldan kaçıncı eleman olduğunu
		// söyler
		System.out.println(mesaj.lastIndexOf('e'));

		// replace:değiştirmek
		// boşlukları '-' karakteriyle değiştirir
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);

		// 2.indeksten başlayarak 5. index'e kadar alır karakterleri ('gün' alınmış
		// olur)
		System.out.println(mesaj.substring(2, 5));

		// her bir kelimeyi tek tek yazdırır
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		// mesajı küçük harfe çevirir
		System.out.println(mesaj.toLowerCase());
		// mesajı büyük harfe çevirir
		System.out.println(mesaj.toUpperCase());

		// mesajın başındaki ve sonundaki boşlukları atar
		String mesaj2 = "          Bugün hava çok güzel.            ";
		System.out.println(mesaj2.trim());

		// ASAL SAYI

		int number = 23;
		int remainder = number % 2;
		// System.out.println(remainder);

		boolean isPrime = true;

		if (number == 1) {
			System.out.println("Sayı asal değildir.");
			return;
		}

		if (number < 2) {
			System.out.println("Geçersiz sayı.");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime) {
			System.out.println("Sayı asaldır.");
		} else {
			System.out.println("Sayı asal değildir.");
		}

		// SESLİ HARFLER

		char harf = 'E';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın Sesli harf");
			break;
		default:
			System.out.println("İnce sesli harf");
			break;
		}

		// MÜKEMMEL SAYI

		// 6 --> 1,2,3
		int number3 = 27;
		int sum = 0;

		for (int i = 1; i < number3; i++) {
			if (number3 % i == 0) {
				sum += i;
			}
		}

		if (sum == number3) {
			System.out.println(number3 + " mükemmel bir sayıdır.");
		} else {
			System.out.println(number3 + " mükemmel bir sayı değildir.");
		}

		// ARKADAŞ SAYI

		int number1 = 220;
		int number2 = 284;
		int total1 = 0;
		int total2 = 0;

		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				total1 += i;
			}
		}

		for (int i = 1; i < number2; i++) {
			if (number2 % i == 0) {
				total2 += i;
			}
		}

		if (number1 == total2 && number2 == total1) {
			System.out.println(number1 + " ve " + number2 + " arkadaş sayılardır.");
		} else {
			System.out.println(number1 + " ve " + number2 + " arkadaş sayı değildir.");
		}

		// SAYI BULMA

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };

		int aranacak = 9;

		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Sayı mevcuttur.");
		} else {
			System.out.println("Sayı mevcut değildir.");
		}

	}

}
