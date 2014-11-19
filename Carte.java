package Moteur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Carte {

	private static ConcurrentLinkedQueue<Carte> pioche;
	private List<Carte> talon;
	
	/*
	 * (non-javadoc)
	 */

	private int valeur;

	/*
	 * (non-javadoc)
	 */
	private couleurCarte couleur;

	/*
	 * (non-javadoc)
	 */
	
	private Joueur joueur = null;

	/*
	 * (non-javadoc)
	 */
	private boolean carteJouable;
	public enum couleurCarte{coeur,carreau,pique,trefle};
	
	static public void distribuerCarte(int nombreJoueurVirtuel){
		int nombrePaquet=0;
		
		nombrePaquet=nombreJoueurVirtuel/4;
		
		if ((nombreJoueurVirtuel%4) != 0) {
			nombrePaquet++;
		}
		System.out.println("nombre paquets : " + nombrePaquet);
		Carte.creerPioche(nombrePaquet);
		
	}
	
	static public void creerPioche(int nombrePaquet){
		
		int[] valeurCarte = new int[8];
		int[] valeurCarteSpeciale = new int[5];
		int i,j;
		
		valeurCarte[0]=3;
		valeurCarte[1]=4;
		valeurCarte[2]=5;
		valeurCarte[3]=6;
		valeurCarte[4]=9;
		valeurCarte[5]=11;
		valeurCarte[6]=12;
		valeurCarte[7]=13;
		valeurCarteSpeciale[0]=1;
		valeurCarteSpeciale[1]=2;
		valeurCarteSpeciale[2]=7;
		valeurCarteSpeciale[3]=8;
		valeurCarteSpeciale[4]=10;
		System.out.println("pas probleme 1");
		ArrayList piocheDeMelange = new ArrayList();
		for (i=0;i<nombrePaquet;i++){
			for (j=0;j<13;j++){
				for (couleurCarte cc : couleurCarte.values()){
					if (j==0 || j==1 || j==6 || j==7 || j==9)
					{
						CarteSpeciale m = new CarteSpeciale((j+1),cc);
						piocheDeMelange.add(m);
						System.out.println("pas probleme "+(j+1)+" "+i+" "+cc);
					}
					else{
					
					 	Carte m = new Carte((j+1),cc);
						piocheDeMelange.add(m);
						System.out.println("pas probleme "+(j+1)+" "+i+" "+cc);
					}
					}
				}
			}
		
		Collections.shuffle(piocheDeMelange);
		
		pioche = new ConcurrentLinkedQueue();
		System.out.println("boucle list :");
		ListIterator<Carte> it = piocheDeMelange.listIterator();
		while (it.hasNext()){
			Carte element = it.next();
			//System.out.println(element.couleur + " " + element.valeur);
			pioche.add(element);
		}
		System.out.println("boucle queue :");
	for(i=0;i<(nombrePaquet*52);i++){
		Carte elementtest = pioche.remove();
		System.out.println(elementtest.couleur+" "+elementtest.valeur);
	}
		}
		
	
	public Carte(int valeur,couleurCarte ccarte){
		this.couleur=ccarte;
		this.valeur=valeur;
		System.out.println("je suis le "+this.valeur+" "+"de"+" "+this.couleur);
		
	}

	public void determinerCarteJouable() {

	}

	/**
	 * Getter of the property <tt>valeur</tt>
	 * 
	 * @return Returns the valeur.
	 * 
	 */

	public int getValeur() {
		return valeur;
	}

	/**
	 * Setter of the property <tt>valeur</tt>
	 * 
	 * @param valeur
	 *            The valeur to set.
	 * 
	 */
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	/**
	 * Getter of the property <tt>couleur</tt>
	 * 
	 * @return Returns the couleur.
	 * 
	 */

	public couleurCarte getCouleur() {
		return couleur;
	}

	/**
	 * Setter of the property <tt>couleur</tt>
	 * 
	 * @param couleur
	 *            The couleur to set.
	 * 
	 */
	

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

