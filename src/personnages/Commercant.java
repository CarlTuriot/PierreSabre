package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
	}

	public int seFaireExtorquer() {
		int argentPerdu = argent;
		argent = 0;
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return argentPerdu;
	}
	
	public void recevoir(int gain) {
		argent+=gain;
		parler(gain + " sous ! Je te remercie généreux donateur!");
	}
	
}
