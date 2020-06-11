// Halil Ýbrahim Karabulut 185541044

//Ana sýnýftan üretilen diðer sýnýf
public class MongoDatabase extends Database {

	public MongoDatabase(String dbisim, String dbaciklama) {
		super(dbisim, dbaciklama);
		
	}

	@Override
	public void add() {
		
		System.out.println("MongoDatabase ekleme iþlemi gerçekleþtirildi");
	}

	@Override
	public void update() {
		
		System.out.println("MongoDatabase güncelleme iþlemi gerçekleþtirildi");
	}
	
	
	
	// ekleme ve güncelleme metodlarý override edildi 

}
