// Halil �brahim Karabulut 185541044


// Database programlama i�in haz�rlanan oop mant���n� net �ekilde g�rebilece�iniz iki adet s�n�ftan olu�tan �devim

public class Database {
	
	public String dbisim;
	public String dbaciklama;
	private String dbturu;
	// Ana s�n�f i�in �� adet �zellik eklendi
	
	public Database(String dbisim , String dbaciklama) {
		
		dbisim = this.dbisim;
		dbaciklama = this.dbaciklama;
		
	}
	// S�n�fa ait yap�c� metod haz�rland�
	
	
	public String getDbturu() {
		return dbturu;
	}
	public void setDbturu(String dbturu) {
		this.dbturu = dbturu;
	}
	// Private �ekilde tan�mlanan dbturu �zelli�i i�in get ve set metodlar� yaz�ld�
	
	public void add() {
		
		System.out.println("Database ekleme i�lemi ger�ekle�tirildi");
	}
	
	public void update() {
		
		System.out.println("Database g�ncelleme i�lemi ger�ekle�tirildi");
		
	}
	
	private void delete() {
		
		System.out.println("Database silme i�lemi ger�ekle�tirildi");
		
	}
	
	// biri private olmak �zere �� fonksiyon tan�mland�
	

}
