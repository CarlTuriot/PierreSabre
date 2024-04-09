package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	protected int argent;
	
	public Humain(String nom, String boissonFav, int argent) {
		this.nom = nom;
		this.argent = argent;
		this.boissonFav = boissonFav;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println(nom + " - " + texte + "»");
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFav);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFav + " ! GLOUPS !");
	}
	
	private void gagnerArgent(int gain) {
		
	}
	
	private void perdreArgent(int perte) {
		
	}
	
	public void acheter(String bien, int prix) {
		if (argent>prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		}
		argent-=prix;
	}
	
}
