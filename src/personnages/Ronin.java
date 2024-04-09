package personnages;

public class Ronin extends Humain {
	private int honneur=1;

	public Ronin(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
		
	}

	public void donner(Commercant beneficiaire) {
		int gain = argent/10;
		parler(beneficiaire.getNom() + "prend ces " + gain + " sous.");
		beneficiaire.recevoir(gain);
		argent-=gain;
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (2*honneur>=adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			int gain = adversaire.perdre();
			gagnerArgent(gain);
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argent);
			perdreArgent(argent);
		}
	}

}
