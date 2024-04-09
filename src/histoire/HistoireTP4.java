package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {
		
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 45, "Warsong");
		Ronin roro = new Ronin("Roro", "vin", 54);
		roro.provoquer(yaku);


	}

}
