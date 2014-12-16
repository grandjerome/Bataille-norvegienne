package Moteur;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Random;

public class StrategieLeMeilleurPourLaFin implements Strategie{

	public void poserCarteStrategique(JoueurVirtuel j) {
		ArrayList<Carte> cartesJouables = new ArrayList<Carte>();
		ArrayList<Carte> cartesNormalesJouables = new ArrayList<Carte>();
		ArrayList<Carte> cartesAPoser = new ArrayList<Carte>();
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
				 ListIterator<Carte> it2= cartesNormalesJouables.listIterator();
				 Carte cartePlusPetite=it2.next();
				 while(it2.hasNext()){
					 Carte element=it2.next();
					 if (element.getValeur()<cartePlusPetite.getValeur()){
						 cartePlusPetite=element;
					 }
				 } 
				 carteAPoser=cartePlusPetite;
				 System.out.println("------cartes à poser : "+carteAPoser.toString()); 
			 }
			 else {
				 ListIterator<Carte> it2= cartesJouables.listIterator();
				 Carte cartePlusPetite=it2.next();
				 while(it2.hasNext()){
					 Carte element=it2.next();
					 if (element.getValeur()<cartePlusPetite.getValeur()){
						 cartePlusPetite=element;
					 }
				 } 
				 carteAPoser=cartePlusPetite;
				 System.out.println("------cartes à poser : "+carteAPoser.toString());
			 }
			 ListIterator<Carte> it4 = cartesJouables.listIterator();
			 while (it4.hasNext()){
			 	Carte element = it4.next();
			 	if (element.getValeur()==carteAPoser.getValeur()){
			 		cartesAPoser.add(element);
			 	}			
			}
			
			
			if (carteAPoser.estAs()){
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
	
	public void echangerCarte(JoueurVirtuel j){
		ArrayList<Carte> mainCartesSpeciales = new ArrayList<Carte>();
		ArrayList<Carte> faceVisibleCartesNormales = new ArrayList<Carte>();
		//System.out.println("main : "+j.getmain().toString());
		//System.out.println("face visible : "+j.getfaceVisible().toString());
		ListIterator<Carte> it = j.getmain().listIterator();
		while (it.hasNext()){
			Carte element = it.next();
			if (element.estCarteSpeciale()){
				mainCartesSpeciales.add(element);
			}			
		}
		//System.out.println("cartes spéciales en main : "+mainCartesSpeciales.toString());
		ArrayList<Carte> list = new ArrayList<Carte>( j.getfaceVisible() );
		ListIterator<Carte> it2 = list.listIterator();
		//System.out.println("cartes dans face visible dans list : "+list.toString());
		while (it2.hasNext()){
			Carte element = it2.next();
			if (element.estCarteSpeciale()==false){
				faceVisibleCartesNormales.add(element);
			}			
		}
		if (faceVisibleCartesNormales.size()<=mainCartesSpeciales.size()){
			for (int i=0; i<faceVisibleCartesNormales.size();i++){
				Carte carteAEchangerFacevisible = faceVisibleCartesNormales.get(i);
				Carte carteAEchangerMain = mainCartesSpeciales.get(i);
				j.getmain().remove(carteAEchangerMain);
				j.getmain().add(carteAEchangerFacevisible);
				j.getfaceVisible().remove(carteAEchangerFacevisible);
				j.getfaceVisible().add(carteAEchangerMain);
			}	
		}
		else {
			for (int i=0; i<mainCartesSpeciales.size();i++){
				Carte carteAEchangerFacevisible = faceVisibleCartesNormales.get(i);
				Carte carteAEchangerMain = mainCartesSpeciales.get(i);
				j.getmain().remove(carteAEchangerMain);
				j.getmain().add(carteAEchangerFacevisible);
				j.getfaceVisible().remove(carteAEchangerFacevisible);
				j.getfaceVisible().add(carteAEchangerMain);
			}

		}
		System.out.println("après échange, main : "+j.getmain().toString());
		System.out.println("après échange, face visible : "+j.getfaceVisible().toString());	
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
