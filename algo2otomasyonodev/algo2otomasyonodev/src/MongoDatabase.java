// Halil �brahim Karabulut 185541044

//Ana s�n�ftan �retilen di�er s�n�f
public class MongoDatabase extends Database {

	public MongoDatabase(String dbisim, String dbaciklama) {
		super(dbisim, dbaciklama);
		
	}

	@Override
	public void add() {
		
		System.out.println("MongoDatabase ekleme i�lemi ger�ekle�tirildi");
	}

	@Override
	public void update() {
		
		System.out.println("MongoDatabase g�ncelleme i�lemi ger�ekle�tirildi");
	}
	
	
	
	// ekleme ve g�ncelleme metodlar� override edildi 

}
