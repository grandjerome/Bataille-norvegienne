package Moteur;

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
	private Carte main;

	/*
	 * (non-javadoc)
	 */
	private Carte faceVisible;

	/*
	 * (non-javadoc)
	 */
	private Carte faceCachee;

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

	public Carte getMain() {
		return main;
	}

	/**
	 * Setter of the property <tt>main</tt>
	 * 
	 * @param main
	 *            The main to set.
	 * 
	 */
	public void setMain(Carte main) {
		this.main = main;
	}

	/**
	 * Getter of the property <tt>faceVisible</tt>
	 * 
	 * @return Returns the faceVisible.
	 * 
	 */

	public Carte getFaceVisible() {
		return faceVisible;
	}

	/**
	 * Setter of the property <tt>faceVisible</tt>
	 * 
	 * @param faceVisible
	 *            The faceVisible to set.
	 * 
	 */
	public void setFaceVisible(Carte faceVisible) {
		this.faceVisible = faceVisible;
	}

	/**
	 * Getter of the property <tt>faceCachee</tt>
	 * 
	 * @return Returns the faceCachee.
	 * 
	 */

	public Carte getFaceCachee() {
		return faceCachee;
	}

	/**
	 * Setter of the property <tt>faceCachee</tt>
	 * 
	 * @param faceCachee
	 *            The faceCachee to set.
	 * 
	 */
	public void setFaceCachee(Carte faceCachee) {
		this.faceCachee = faceCachee;
	}

}


