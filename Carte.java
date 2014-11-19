package Moteur;

public class Carte {

	/*
	 * (non-javadoc)
	 */
	private String valeur;

	/*
	 * (non-javadoc)
	 */
	private String couleur;

	/*
	 * (non-javadoc)
	 */
	private TasDeCartes tasDeCartes = null;

	/*
	 * (non-javadoc)
	 */
	private Joueur joueur = null;

	/*
	 * (non-javadoc)
	 */
	private boolean carteJouable;

	public void determinerCarteJouable() {

	}

	/**
	 * Getter of the property <tt>valeur</tt>
	 * 
	 * @return Returns the valeur.
	 * 
	 */

	public String getValeur() {
		return valeur;
	}

	/**
	 * Setter of the property <tt>valeur</tt>
	 * 
	 * @param valeur
	 *            The valeur to set.
	 * 
	 */
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	/**
	 * Getter of the property <tt>couleur</tt>
	 * 
	 * @return Returns the couleur.
	 * 
	 */

	public String getCouleur() {
		return couleur;
	}

	/**
	 * Setter of the property <tt>couleur</tt>
	 * 
	 * @param couleur
	 *            The couleur to set.
	 * 
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	/**
	 * Getter of the property <tt>carteJouable</tt>
	 * 
	 * @return Returns the carteJouable.
	 * 
	 */

	public boolean getCarteJouable() {
		return carteJouable;
	}

	/**
	 * Setter of the property <tt>carteJouable</tt>
	 * 
	 * @param carteJouable
	 *            The carteJouable to set.
	 * 
	 */
	public void setCarteJouable(boolean carteJouable) {
		this.carteJouable = carteJouable;
	}

}

// /**
// * Getter of the property <tt>tasDeCartes</tt>
// *
// * @return Returns the tasDeCartes.
// *
// */
//
// public TasDeCartes getTasDeCartes() {
// return tasDeCartes;
// }
// /**
// * Setter of the property <tt>tasDeCartes</tt>
// *
// * @param tasDeCartes
// * The tasDeCartes to set.
// *
// */
// public void setTasDeCartes(TasDeCartes tasDeCartes) {
// this.tasDeCartes = tasDeCartes;
// }
// /**
// * Setter of the property <tt>joueur</tt>
// *
// * @param joueur
// * The joueur to set.
// *
// */
// public void setJoueur(Joueur joueur) {
// this.joueur = joueur;
// }
// /**
// * Getter of the property <tt>joueur</tt>
// *
// * @return Returns the joueur.
// *
// */
//
// public Joueur getJoueur() {
// return joueur;
// }

