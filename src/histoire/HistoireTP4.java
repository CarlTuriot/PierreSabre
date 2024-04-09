package histoire;

import personnages.Humain;
import personnages.Commercant;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant prof = new Commercant("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.seFaireExtorquer();
		prof.recevoir(15);
		prof.boire();


	}

}
