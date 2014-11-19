package Moteur;

import java.util.Collection;
import java.util.Iterator;

public class Partie {

	/*
	 * (non-javadoc)
	 */
	private int nombreJoueurVirtuel;

	/*
	 * (non-javadoc)
	 */
	private String nomVainqueur;

	/**
*
*/
	private Collection<Joueur> joueur;

	public void determinerVainqueur() {

	}

	public void finPartie() {

	}

	public void debutPartie() {

	}

	/**
	 * Getter of the property <tt>nombreJoueurVirtuel</tt>
	 * 
	 * @return Returns the nombreJoueurVirtuel.
	 * 
	 */

	public int getNombreJoueurVirtuel() {
		return nombreJoueurVirtuel;
	}

	/**
	 * Setter of the property <tt>nombreJoueurVirtuel</tt>
	 * 
	 * @param nombreJoueurVirtuel
	 *            The nombreJoueurVirtuel to set.
	 * 
	 */
	public void setNombreJoueurVirtuel(int nombreJoueurVirtuel) {
		this.nombreJoueurVirtuel = nombreJoueurVirtuel;
	}

	/**
	 * Getter of the property <tt>nomVainqueur</tt>
	 * 
	 * @return Returns the nomVainqueur.
	 * 
	 */

	public String getNomVainqueur() {
		return nomVainqueur;
	}

	/**
	 * Setter of the property <tt>nomVainqueur</tt>
	 * 
	 * @param nomVainqueur
	 *            The nomVainqueur to set.
	 * 
	 */
	public void setNomVainqueur(String nomVainqueur) {
		this.nomVainqueur = nomVainqueur;
	}

}

// /**
// * Setter of the property <tt>nombreJoueurVirtuel</tt>
// *
// * @param nombreJoueurVirtuel
// * The nombreJoueurVirtuel to set.
// *
// */
// public void setNombreJoueurVirtuel(String nombreJoueurVirtuel) {
// this.nombreJoueurVirtuel = nombreJoueurVirtuel;
// }
// /**
// * Getter of the property <tt>nombreJoueurVirtuel</tt>
// *
// * @return Returns the nombreJoueurVirtuel.
// *
// */
//
// public String getNombreJoueurVirtuel() {
// return nombreJoueurVirtuel;
// }
// /**
// * Setter of the property <tt>nombreJoueurVirtuel</tt>
// *
// * @param nombreJoueurVirtuel
// * The nombreJoueurVirtuel to set.
// *
// */
// public void setNombreJoueurVirtuel(int nombreJoueurVirtuel) {
// this.nombreJoueurVirtuel = nombreJoueurVirtuel;
// }
// /**
// * Getter of the property <tt>nombreJoueurVirtuel</tt>
// *
// * @return Returns the nombreJoueurVirtuel.
// *
// */
//
// public int getNombreJoueurVirtuel() {
// return nombreJoueurVirtuel;
// }
// /**
// * Returns an iterator over the elements in this collection.
// *
// * @return an <tt>Iterator</tt> over the elements in this collection
// * @see java.util.Collection#iterator()
// *
// */
// public Iterator<Joueur> joueurIterator() {
// return joueur.iterator();
// }
// /**
// * Returns <tt>true</tt> if this collection contains no elements.
// *
// * @return <tt>true</tt> if this collection contains no elements
// * @see java.util.Collection#isEmpty()
// *
// */
// public boolean isJoueurEmpty() {
// return joueur.isEmpty();
// }
// /**
// * Ensures that this collection contains the specified element (optional
// * operation).
// *
// * @param element
// * whose presence in this collection is to be ensured.
// * @see java.util.Collection#add(Object)
// *
// */
// public boolean addJoueur(Joueur joueur) {
// return this.joueur.add(joueur);
// }
// /**
// * Getter of the property <tt>joueur</tt>
// *
// * @return Returns the joueur.
// *
// */
//
// public Collection<Joueur> getJoueur() {
// return joueur;
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
// public boolean removeJoueur(Joueur joueur) {
// return this.joueur.remove(joueur);
// }
// /**
// * Returns all elements of this collection in an array.
// *
// * @return an array containing all of the elements in this collection
// * @see java.util.Collection#toArray()
// *
// */
// public Joueur[] joueurToArray() {
// return joueur.toArray(new Joueur[joueur.size()]);
// }
// /**
// * Returns <tt>true</tt> if this collection contains all of the elements
// * in the specified collection.
// *
// * @param elements
// * collection to be checked for containment in this
// * collection.
// * @see java.util.Collection#containsAll(Collection)
// *
// */
// public boolean containsAllJoueur(Collection<Joueur> joueur) {
// return this.joueur.containsAll(joueur);
// }
// /**
// * Setter of the property <tt>joueur</tt>
// *
// * @param joueur
// * the joueur to set.
// *
// */
// public void setJoueur(Collection<Joueur> joueur) {
// this.joueur = joueur;
// }
// /**
// * Returns <tt>true</tt> if this collection contains the specified
// * element.
// *
// * @param element
// * whose presence in this collection is to be tested.
// * @see java.util.Collection#contains(Object)
// *
// */
// public boolean containsJoueur(Joueur joueur) {
// return this.joueur.contains(joueur);
// }
// /**
// * Returns the number of elements in this collection.
// *
// * @return the number of elements in this collection
// * @see java.util.Collection#size()
// *
// */
// public int joueurSize() {
// return joueur.size();
// }
// /**
// * Removes all of the elements from this collection (optional
// * operation).
// *
// * @see java.util.Collection#clear()
// *
// */
// public void clearJoueur() {
// this.joueur.clear();
// }
