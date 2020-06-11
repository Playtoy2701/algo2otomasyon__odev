// Halil Ýbrahim Karabulut 185541044


// Database programlama için hazýrlanan oop mantýðýný net þekilde görebileceðiniz iki adet sýnýftan oluþtan ödevim

public class Database {
	
	public String dbisim;
	public String dbaciklama;
	private String dbturu;
	// Ana sýnýf için üç adet özellik eklendi
	
	public Database(String dbisim , String dbaciklama) {
		
		dbisim = this.dbisim;
		dbaciklama = this.dbaciklama;
		
	}
	// Sýnýfa ait yapýcý metod hazýrlandý
	
	
	public String getDbturu() {
		return dbturu;
	}
	public void setDbturu(String dbturu) {
		this.dbturu = dbturu;
	}
	// Private þekilde tanýmlanan dbturu özelliði için get ve set metodlarý yazýldý
	
	public void add() {
		
		System.out.println("Database ekleme iþlemi gerçekleþtirildi");
	}
	
	public void update() {
		
		System.out.println("Database güncelleme iþlemi gerçekleþtirildi");
		
	}
	
	private void delete() {
		
		System.out.println("Database silme iþlemi gerçekleþtirildi");
		
	}
	
	// biri private olmak üzere üç fonksiyon tanýmlandý
	

}
