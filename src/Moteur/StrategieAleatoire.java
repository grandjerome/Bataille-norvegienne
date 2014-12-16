package Moteur;

import java.util.ArrayList;
import java.util.Random;
import java.util.ListIterator;

public class StrategieAleatoire implements Strategie {

	public void poserCarteStrategique(JoueurVirtuel j) {
		 ArrayList<Carte> cartesJouables = new ArrayList<Carte>();
		 ArrayList<Carte> cartesAPoser = new ArrayList<Carte>();
		 
		 Random random = new Random();
		 cartesJouables = determinerCartesJouables(j.getmain());
		 System.out.println("--------main de "+j.getNom()+" : "+j.getmain().toString());
		 System.out.println("-----cartes jouables : "+cartesJouables.toString());
		 
		 //System.out.println(cartesJouables.toString());
		 if (cartesJouables.size()>0){
			 	int index = random.nextInt(cartesJouables.size());
			 	Carte carteAPoser = cartesJouables.get(index);
			 	ListIterator<Carte> it = j.getmain().listIterator();
			 	while (it.hasNext()){
			 		Carte element = it.next();
			 		if (element.getValeur()==carteAPoser.getValeur()){
			 			cartesAPoser.add(element);
			 		}			
			 	}
			System.out.println("------cartes à poser : "+cartesAPoser.toString());
			if (cartesAPoser.get(0).estAs()){
				ListIterator<Joueur> it2 = Partie.partie.getlistJoueur().listIterator();
				Joueur joueurRecupereTalon = it2.next();
				System.out.println("joueur qui recupere le talon : "+joueurRecupereTalon);
				int nbMinCartesEnMain =joueurRecupereTalon.getmain().size();
				while (it2.hasNext()){
					Joueur element = it2.next();
					if (element.getmain().size()<nbMinCartesEnMain&&(!(element.equals(j)))){
						nbMinCartesEnMain=element.getmain().size();
						joueurRecupereTalon=element;
					}
					System.out.println("dans iterator : "+element);
				}
				ListIterator<Carte> it3 = cartesAPoser.listIterator();
				while (it3.hasNext()){
					Carte element = it3.next();
					Partie.partie.getTasDeCarte().getTalon().add(element);
					j.getmain().remove(element);
				}	
				Partie.partie.getTasDeCarte().donnerTalon(Partie.partie.getlistJoueur().get((Partie.partie.getlistJoueur().indexOf(joueurRecupereTalon))));
				System.out.println(j+" donne le talon à "+Partie.partie.getlistJoueur().get((Partie.partie.getlistJoueur().indexOf(joueurRecupereTalon))));
				piocher(cartesAPoser.size(), j);
			}
			else {
				j.poserCarte(cartesAPoser, j.getmain());
				piocher(cartesAPoser.size(), j); 
			}
		 }
		 else {
			 System.out.println("L'ordi ne peut pas jouer!");
			 Partie.partie.getTasDeCarte().donnerTalon(j);
			 
		 }

		 
	}
	
	public ArrayList<Carte> determinerCartesJouables(ArrayList<Carte> main){
		ArrayList<Carte> cartesJouables = new ArrayList<Carte>();
		ListIterator<Carte> it = main.listIterator();
		while (it.hasNext()){
			Carte element = it.next();
			if (element.determinerCarteJouable()){
				cartesJouables.add(element);
			}			
		}
		//System.out.println("l'ordi peut jouer "+nbCartesJouables+" cartes");
		return cartesJouables;
	}
	
	public void echangerCarte(JoueurVirtuel j){
		
	}
	
	public void piocher(int nbCartesPosees,Joueur j){
		for (int i=0; i<nbCartesPosees; i++){
			if (j.getmain().size()<3){
				j.piocher(1);
			}
		}
	}

}
