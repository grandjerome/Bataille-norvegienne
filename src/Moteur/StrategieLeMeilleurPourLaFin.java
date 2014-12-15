package Moteur;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class StrategieLeMeilleurPourLaFin implements Strategie{

	public void poserCarteStrategique(JoueurVirtuel j) {
		ArrayList<Carte> cartesJouables = new ArrayList<Carte>();
		ArrayList<Carte> cartesNormalesJouables = new ArrayList<Carte>();
		ArrayList<Carte> cartesAPoser = new ArrayList<Carte>();
		int nbCartesAPoser=0;
		Carte carteAPoser;
		Random random = new Random();
		 cartesJouables = determinerCartesJouables(j.getmain());
		 System.out.println("--------main de "+j.nom+" : "+j.getmain().toString());
		 	 
		 ListIterator<Carte> it = cartesJouables.listIterator();
		 	while (it.hasNext()){
		 		Carte element = it.next();
		 		if (element.estCarteSpeciale()==false){
		 			cartesNormalesJouables.add(element);
		 		}
		 	}
		 System.out.println("-----cartes normales jouables : "+cartesNormalesJouables.toString());
		 
		 if (cartesJouables.size()>0){
			 if (cartesNormalesJouables.size()>0){
				 int index = random.nextInt(cartesNormalesJouables.size());
<<<<<<< HEAD
				 //int index = cartesNormalesJouables.size();
				 carteAPoser=cartesNormalesJouables.get(index);
				 System.out.println("------cartes ï¿½ poser : "+carteAPoser); 
=======
				 carteAPoser=cartesNormalesJouables.get(index);
				 System.out.println("------cartes à poser : "+cartesAPoser.toString()); 
>>>>>>> origin/master
			 }
			 else {
				 int index = random.nextInt(cartesJouables.size());
				 carteAPoser=cartesJouables.get(index);
<<<<<<< HEAD
				 System.out.println("------cartes ï¿½ poser : "+carteAPoser);//cartesaposer
			 }
			 ListIterator<Carte> it2 = cartesJouables.listIterator();
			while (it2.hasNext()){
			 	Carte element = it2.next();
=======
				 System.out.println("------cartes à poser : "+cartesAPoser.toString());
			 }
			while (it.hasNext()){
			 	Carte element = it.next();
>>>>>>> origin/master
			 	if (element.getValeur()==carteAPoser.getValeur()){
			 		cartesAPoser.add(element);
			 		nbCartesAPoser++;
			 	}			
			}
		 }
		 else {
			 System.out.println("L'ordi ne peut pas jouer!");
			 Partie.partie.getTasDeCarte().donnerTalon(j);
		 }

<<<<<<< HEAD
		j.poserCarte(cartesAPoser);
=======
		j.poserCarte(cartesAPoser, j.getmain());
>>>>>>> origin/master
		piocher(cartesAPoser.size(), j);

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

}

