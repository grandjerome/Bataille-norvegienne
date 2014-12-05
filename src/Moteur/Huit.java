package Moteur;

import java.util.ArrayList;
import java.util.ListIterator;

import Moteur.As.couleurCarte;

public class Huit extends Moteur.CarteSpeciale {

public enum couleurCarte{coeur,carreau,pique,trefle};
	
    private String couleur;
	private int valeur;
	public Huit(int valeurcarte, String couleurcarte){
		couleur=couleurcarte;
		valeur=valeurcarte;
		
	}
	
	 public void jouerEffet() {
		while (Partie.partie.getiIterateurJoueur().hasNext()){
			Partie.partie.getiIterateurJoueur().next();
		}

	}
	
	public void donnerTalon() {

	}
	public void passerTour() {

	}
	public String getCouleur() {
		return couleur;
	}
	public int getValeur() {
		return valeur;
	}
	public String toString(){
		//System.out.println("valeur en chiffre : "+ this.valeur);
		return("Huit"+" de "+this.couleur);
	}

	
}

