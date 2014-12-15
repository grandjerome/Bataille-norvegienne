package Moteur;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

import javax.swing.JSpinner.ListEditor;

import Moteur.Carte.couleurCarte;



public class As extends Moteur.CarteSpeciale {


public enum couleurCarte{coeur,carreau,pique,trefle};
	
    private String couleur;
	private int valeur;
	static boolean effetJoue;
	public As(int valeurcarte, String couleurcarte){
		valeur=valeurcarte;
		couleur=couleurcarte;
		effetJoue=false;
		
	}
	
	public void jouerEffet() {
		if(!(effetJoue)){
		Scanner sc = new Scanner(System.in);
		int i=1;
		System.out.println("à qui voulez vous donner le talon (numero)");
		ListIterator<Joueur> it = Partie.partie.getlistJoueur().listIterator();
		while (it.hasNext()){
			Joueur element = it.next();
			System.out.println(element+" "+(i));
			i++;
		}
		System.out.println("?");
		int joueur = sc.nextInt();
		if (!(contreAs(Partie.partie.getlistJoueur().get(joueur-1)))){
			Partie.partie.getTasDeCarte().donnerTalon(Partie.partie.getlistJoueur().get(joueur-1));
			effetJoue=true;
		}
		
		}
	}
	
	public String getCouleur() {
		return couleur;
	}
	public int getValeur() {
		return valeur;
	}
	public void resetEffet(){
		effetJoue=false;
	}
	public boolean contreAs(Joueur joueur){
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		boolean contre=false;
		System.out.println("voulez vous contrer l'As ?");
		String reponse=sc.nextLine();
		if(reponse=="oui"){
			System.out.println("quelle carte voulez vous utiliser pour contrer ?(numero 1,2,...)");
			ListIterator<Carte> it = joueur.getmain().listIterator();
			int i=0;
			ArrayList<Carte> carteContre = new ArrayList<Carte>();
			while (it.hasNext()){
				Carte element=it.next();
				
				if (element.estDeux() || element.estAs()){
					carteContre.add(element);	
				}
			}
			System.out.println(carteContre);
			int nocarteajouer =sc2.nextInt();
			Carte carteajouer=joueur.getmain().get(nocarteajouer-1);
			carteContre.clear();
			carteContre.add(carteajouer);
			joueur.poserCarte(carteContre);
			contre=true;
			
		}
		
		return contre;
	}
	public String toString(){
		//System.out.println("coco");
		//System.out.println("valeur en chiffre : "+ this.valeur);
		return("As"+" de "+this.couleur);
	}
	
}
