import java.util.Scanner;  // Import class yang diperlukan dari library java
import java.text.*;

class Main {
	//Fungsi untuk menampilkan nilai angka dengan format desimal
	public static void customFormat(String pattern, double value ) {
      DecimalFormat myFormatter = new DecimalFormat(pattern);
      String output = myFormatter.format(value);
      System.out.print(output);
	}
	//fungsi utama 
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
	
		System.out.println(" ");
		System.out.println("******************************************************");
		System.out.println("     Selamat Datang di Aplikasi Ramalan BestMatch     ");
		System.out.println("******************************************************");
		System.out.println(" ");
		System.out.println(" Data Anda ");  // Output user input
		System.out.println("------------------------------------------------------");
		System.out.print(" Masukkan Nama Anda : ");
		String namaAnda = myObj.nextLine();  // Read user input
		System.out.print(" Masukkan Umur Anda : ");
		int umurAnda = myObj.nextInt();
		myObj.nextLine();
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" Data Pasangan Anda ");  // Output user input
		System.out.println("------------------------------------------------------");
		System.out.print(" Masukkan Nama Pasangan Anda : ");
		String namaPasangan = myObj.nextLine();  // Read user input
		System.out.print(" Masukkan Umur Pasangan Anda : ");
		int umurPasangan = myObj.nextInt();
		myObj.nextLine();
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" " + namaAnda + " [" + umurAnda + "] Tahun");
		System.out.println("                        ");
		System.out.println("     ***       ***      ");
		System.out.println("    *****     *****     ");
		System.out.println("   *****************    ");
		System.out.println("    ***************     ");
		System.out.println("      ************      ");
		System.out.println("        ********        ");
		System.out.println("         ******         ");
		System.out.println("           **           ");
		System.out.println("                        ");
		System.out.println(" " + namaPasangan + " [" + umurPasangan + "] Tahun");
		
		System.out.println(" ");		
		System.out.println(" ");
		System.out.println(" Tekan ENTER untuk melihat hasil ramalan");
		String enter = myObj.nextLine();
		System.out.println("******************************************************");
		
		int min = 50;
		int max = 100;
		int random_val = (int)Math.floor(Math.random()*(max-min+1)+min);
		double hasil = random_val/1.1;
		
		System.out.println(" ");
		System.out.print(" Kecocokan anda dengan pasangan anda adalah : ");
		customFormat("##,###.##", hasil); 
		System.out.println(" %");
		System.out.println(" ");
		System.out.println("~  Terima Kasih Telah Menggunakan jasa ramalan kami  ~");
		System.out.println("******************************************************");
	}
}
