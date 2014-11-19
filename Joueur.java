package projet1;

import java.util.Collection;
import java.util.Iterator;

public class Joueur {

	/*
	 * (non-javadoc)
	 */
	private int nbCartes;

	/**
*
*/
	private Collection<Carte> carte = null;

	/*
	 * (non-javadoc)
	 */
	private Main main;

	/*
	 * (non-javadoc)
	 */
	private FaceVisible faceVisible;

	/*
	 * (non-javadoc)
	 */
	private FaceCachee faceCachee;

	/*
	 * (non-javadoc)
	 */
	private Partie partie = null;

	public void echangerCarte() {

	}

	public void poserCarte() {

	}

	/**
	 * Getter of the property <tt>nbCartes</tt>
	 * 
	 * @return Returns the nbCartes.
	 * 
	 */

	public int getNbCartes() {
		return nbCartes;
	}

	/**
	 * Setter of the property <tt>nbCartes</tt>
	 * 
	 * @param nbCartes
	 *            The nbCartes to set.
	 * 
	 */
	public void setNbCartes(int nbCartes) {
		this.nbCartes = nbCartes;
	}

	/**
	 * Getter of the property <tt>main</tt>
	 * 
	 * @return Returns the main.
	 * 
	 */

	public Main getMain() {
		return main;
	}

	/**
	 * Setter of the property <tt>main</tt>
	 * 
	 * @param main
	 *            The main to set.
	 * 
	 */
	public void setMain(Main main) {
		this.main = main;
	}

	/**
	 * Getter of the property <tt>faceVisible</tt>
	 * 
	 * @return Returns the faceVisible.
	 * 
	 */

	public FaceVisible getFaceVisible() {
		return faceVisible;
	}

	/**
	 * Setter of the property <tt>faceVisible</tt>
	 * 
	 * @param faceVisible
	 *            The faceVisible to set.
	 * 
	 */
	public void setFaceVisible(FaceVisible faceVisible) {
		this.faceVisible = faceVisible;
	}

	/**
	 * Getter of the property <tt>faceCachee</tt>
	 * 
	 * @return Returns the faceCachee.
	 * 
	 */

	public FaceCachee getFaceCachee() {
		return faceCachee;
	}

	/**
	 * Setter of the property <tt>faceCachee</tt>
	 * 
	 * @param faceCachee
	 *            The faceCachee to set.
	 * 
	 */
	public void setFaceCachee(FaceCachee faceCachee) {
		this.faceCachee = faceCachee;
	}

}

// /**
// * Ensures that this collection contains the specified element (optional
// * operation).
// *
// * @param element
// * whose presence in this collection is to be ensured.
// * @see java.util.Collection#add(Object)
// *
// */
// public boolean addCarte(Carte carte) {
// return this.carte.add(carte);
// }
// /**
// * Setter of the property <tt>carte</tt>
// *
// * @param carte
// * the carte to set.
// *
// */
// public void setCarte(Collection<Carte> carte) {
// this.carte = carte;
// }
// /**
// * Removes a single instance of the specified element from this
// * collection, if it is present (optional operation).
// *
// * @param element
// * to be removed from this collection, if present.
// * @see java.util.Collection#add(Object)
// *
// */
// public boolean removeCarte(Carte carte) {
// return this.carte.remove(carte);
// }
// /**
// * Getter of the property <tt>carte</tt>
// *
// * @return Returns the carte.
// *
// */
//
// public Collection<Carte> getCarte() {
// return carte;
// }
// /**
// * Returns the number of elements in this collection.
// *
// * @return the number of elements in this collection
// * @see java.util.Collection#size()
// *
// */
// public int carteSize() {
// return carte.size();
// }
// /**
// * Setter of the property <tt>partie</tt>
// *
// * @param partie
// * The partie to set.
// *
// */
// public void setPartie(Partie partie) {
// this.partie = partie;
// }
// /**
// * Getter of the property <tt>partie</tt>
// *
// * @return Returns the partie.
// *
// */
//
// public Partie getPartie() {
// return partie;
// }

