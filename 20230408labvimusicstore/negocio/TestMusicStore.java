package negocio;

public class TestMusicStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MusicStore loja = new MusicStore("Casa do Som");
		loja.setOwnwer("Wolfgang Amadeus Mozart");
		
		loja.displayHoursOfOperation();
		loja.displayOwner();
	}

}
