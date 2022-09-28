
public class Main {
// METHODS

	public static void main(String[] args) {
		sayiBulamaca();
		sayiBulamaca();
		sayiBulamaca();
		sayiBulamaca();

	}

	public static void sayiBulamaca() {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			mesajVer("Sayı mevcuttur: " + aranacak);
		}

		else {
			mesajVer("Sayı mevcut değildir: " + aranacak);
		}
	}

	public static void mesajVer(String mesaj) {

		System.out.println(mesaj);
	}

// METHODS2
	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(15, 7);
		System.out.println(sayi);
		int toplam = topla2(2, 3, 4);
		System.out.println(toplam);

	}

	public static void ekle() {

		System.out.println("Eklendi.");

	}

	public static void sil() {

		System.out.println("Silindi.");

	}

	public static void guncelle() {

		System.out.println("Güncellendi.");

	}

	public static int topla(int sayi1, int sayi2) {

		return sayi1 + sayi2;

	}

	public static int topla2(int... sayilar) { // birden fazla sayı yollamak istediğimde ... ifadesini kullanırım

		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;

	}

	public static String sehirVer() {

		return "Ankara";

	}

//CLASSES

	public static void main(String[] args) {
//reference type
		CustomerManager customerManager = new CustomerManager(); // we create an instance of customerManager of type
																	// CustomerManager. that's how we call classes.
																	// (CustomerManager)
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);

		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 4, 5, 6 };
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);

	}

//ReCap DEMO CLASSES

	public static void main(String[] args) {

		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.Topla(3, 4);
		System.out.println(sonuc);

	}

//CLASSES WITH ATTRIBUTES

	public static void main(String[] args) {

		Product product = new Product(1, "Laptop", "Asus Laptop", 3000, 2, "Siyah");

		/*
		 * Product product = new Product(); product.setName("Laptop"); product.setId(1);
		 * product.setDescription("Asus Laptop"); product.setPrice(5000);
		 * product.setStockAmount(3); System.out.println(product.getName());
		 */
		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		System.out.println(product.getKod());
		System.out.println(product.getId());

	}
	
//INHERITANCE
	
public static void main(String[] args) {
		
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();

		
	}

}
