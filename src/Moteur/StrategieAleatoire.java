package Moteur;

import java.util.ArrayList;
import java.util.Random;
import java.util.ListIterator;

public class StrategieAleatoire implements Strategie {

	public void poserCarteStrategique(JoueurVirtuel j) {
		 ArrayList<Carte> cartesJouables = new ArrayList<Carte>();
		 ArrayList<Carte> cartesAPoser = new ArrayList<Carte>();
		 int nbCartesAPoser=0;
		 
		 Random random = new Random();
		 cartesJouables = determinerCartesJouables(j.getmain());
		 System.out.println("--------main de "+j.nom+" : "+j.getmain().toString());
		 System.out.println("-----cartes jouables : "+cartesJouables.toString());
		 
		 //System.out.println(cartesJouables.toString());
		 if (cartesJouables.size()>0){
			 	nbCartesAPoser=1;
			 	int index = random.nextInt(cartesJouables.size());
			 	Carte carteAPoser = cartesJouables.get(index);
			 	ListIterator<Carte> it = j.getmain().listIterator();
			 	while (it.hasNext()){
			 		Carte element = it.next();
			 		if (element.getValeur()==carteAPoser.getValeur()){
			 			cartesAPoser.add(element);
			 			nbCartesAPoser++;
			 		}			
			 	}
<<<<<<< HEAD
			System.out.println("------cartes ï¿½ poser : "+cartesAPoser.toString());
			j.poserCarte(cartesAPoser);
=======
			System.out.println("------cartes à poser : "+cartesAPoser.toString());
			j.poserCarte(cartesAPoser, j.getmain());
>>>>>>> origin/master
			piocher(cartesAPoser.size(), j);
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
	
	public void echangerCartes(){
		
	}
	
	public void piocher(int nbCartesPosees,Joueur j){
		for (int i=0; i<nbCartesPosees; i++){
			if (j.getmain().size()<3){
				j.piocher(1);
			}
		}
	}

}
