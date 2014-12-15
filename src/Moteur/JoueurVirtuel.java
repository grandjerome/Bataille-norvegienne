package Moteur;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class JoueurVirtuel extends Joueur{

	/*
	 * (non-javadoc)
	 */
<<<<<<< HEAD
	
	public String[] nom={"Roger","Patrick","Corentin","Emilie","Albert","Alberta","Alberte","Albertine","Albin","Alda","Aldo","Aldegonde","Alï¿½the","Alex","Alexandra"};//,Alexandre,Alexandrine,Alexia,Alexiane,Alexis,Aleyde,Alfred,Alfreda,Alice,Alida,Aline,Alix,Aloï¿½s,Aloysius,Alphonse,Alphonsine,Amaï¿½l,Amance,Amand,Amandine,Amoury,Ambroise,Amï¿½dï¿½e,Amï¿½lie,Amos,Anaï¿½s,Anastase,Anastasie,Anatole,Andoche,Andrï¿½,Andrï¿½e,Ange,Angï¿½le,Angï¿½line,Angï¿½lique,Anicet,Anita,Anna,Annabelle,Anne,Annette,Annick,Annie,Annonciade,Anouchka,Anouck,Anselme,Anthelme,Anthony,Antoine,Antoinette,Antonin,Apollinaire,Apolline,Apollos,Arabelle,Arcadius,Arcady,Archibald,Ariane,Arielle,Aristide,Arlette,Armand,Armande,Armel,Armelle,Arnaud,Arnold,Arnould,Arsï¿½ne,Arthur,Astrid,Athanase,Auberi,Aubert,Aubin,Aude,Audrey,Augusta,Auguste,Augustin,Augustine,Aure,Aurï¿½le,Aurï¿½lia,Aurï¿½lie,Aurï¿½lien,Aurore,Ava,Avit,Axel,Axelle,Aymar,Aymeric,Aymone,Babette,Babine,Babita,Balbine,Balthazar,Baptiste,Barbara,Barbe,Barberine,Barnabï¿½,Barnard,Barthï¿½lï¿½my,Bartolomï¿½,Basile,Bastien,Bastienne,Bathilde,Baudouin,Bï¿½atrice,Beatrix,Bï¿½nï¿½dicte,Benjamin,Benjamine,Benoï¿½t,Benoï¿½te,Bï¿½renger};
=======
	private int nbCartes;
	private String nomJoueur;
	public String[] nom={"Roger","Patrick","Corentin","Emilie","Albert","Alberta","Alberte","Albertine","Albin","Alda","Aldo","Aldegonde","Alèthe","Alex","Alexandra"};//,Alexandre,Alexandrine,Alexia,Alexiane,Alexis,Aleyde,Alfred,Alfreda,Alice,Alida,Aline,Alix,Aloïs,Aloysius,Alphonse,Alphonsine,Amaël,Amance,Amand,Amandine,Amoury,Ambroise,Amédée,Amélie,Amos,Anaïs,Anastase,Anastasie,Anatole,Andoche,André,Andrée,Ange,Angèle,Angéline,Angélique,Anicet,Anita,Anna,Annabelle,Anne,Annette,Annick,Annie,Annonciade,Anouchka,Anouck,Anselme,Anthelme,Anthony,Antoine,Antoinette,Antonin,Apollinaire,Apolline,Apollos,Arabelle,Arcadius,Arcady,Archibald,Ariane,Arielle,Aristide,Arlette,Armand,Armande,Armel,Armelle,Arnaud,Arnold,Arnould,Arsène,Arthur,Astrid,Athanase,Auberi,Aubert,Aubin,Aude,Audrey,Augusta,Auguste,Augustin,Augustine,Aure,Aurèle,Aurélia,Aurélie,Aurélien,Aurore,Ava,Avit,Axel,Axelle,Aymar,Aymeric,Aymone,Babette,Babine,Babita,Balbine,Balthazar,Baptiste,Barbara,Barbe,Barberine,Barnabé,Barnard,Barthélémy,Bartolomé,Basile,Bastien,Bastienne,Bathilde,Baudouin,Béatrice,Beatrix,Bénédicte,Benjamin,Benjamine,Benoît,Benoîte,Bérenger};
>>>>>>> origin/master
	static private int indiceNom=0;
	/**
*
*/
<<<<<<< HEAD
	
	private Strategie strategie;

	
	
=======
	
	private Strategie strategie;
	private ArrayList<Carte> main;
	private HashSet<Carte> faceCachee;
	private HashSet<Carte> faceVisible;
	
	public HashSet<Carte> getfaceCachee(){
		return(faceCachee);
	}
	public ArrayList<Carte> getmain(){
		return main;
	}
	public HashSet<Carte> getfaceVisible(){
		return(faceVisible);
	}
>>>>>>> origin/master
	public JoueurVirtuel(){
		if (indiceNom == 15){
			indiceNom=0;
		}
		super.nomJoueur=nom[indiceNom];
		indiceNom++;
		this.strategie = new StrategieLeMeilleurPourLaFin();	
	}
	public void echangerCarte() {
		
	}
	
	
	
	
	
	
	public int determinernbCartesJouables(ArrayList<Carte> main){
		int nbCartesJouables=0;
		ListIterator<Carte> it = super.main.listIterator();
		while (it.hasNext()){
			Carte element = it.next();
			if (element.determinerCarteJouable()){
				nbCartesJouables++;
			}			
		}
		//System.out.println("l'ordi peut jouer "+nbCartesJouables+" cartes");
		return nbCartesJouables;
	}
<<<<<<< HEAD

	

	
=======
	public void poserCarte() {
	}
	
	public void piocher(int nbCarte){
		int i=0;
		while(!(Partie.partie.getTasDeCarte().getpioche().isEmpty()) && i<nbCarte)
		{
		this.main.add(Partie.partie.getTasDeCarte().getpioche().remove());
		i++;
		}
	}
	
	
	public int determinernbCartesJouables(ArrayList<Carte> main){
		int nbCartesJouables=0;
		ListIterator<Carte> it = main.listIterator();
		while (it.hasNext()){
			Carte element = it.next();
			if (element.determinerCarteJouable()){
				nbCartesJouables++;
			}			
		}
		//System.out.println("l'ordi peut jouer "+nbCartesJouables+" cartes");
		return nbCartesJouables;
	}

	

	
>>>>>>> origin/master
	/**
	 * Getter of the property <tt>nbCartes</tt>
	 * 
	 * @return Returns the nbCartes.
	 * 
	 */

	

	/**
	 * Setter of the property <tt>nbCartes</tt>
	 * 
	 * @param nbCartes
	 *            The nbCartes to set.
	 * 
	 */
<<<<<<< HEAD
	
=======
	public void setNbCartes(int nbCartes) {
		this.nbCartes = nbCartes;
	}
>>>>>>> origin/master
	

	/**
	 * Getter of the property <tt>main</tt>
	 * 
	 * @return Returns the main.
	 * 
	 */

	
	/**
	 * Setter of the property <tt>main</tt>
	 * 
	 * @param main
	 *            The main to set.
	 * 
	 */
	public void jouerCarte(){
		strategie.poserCarteStrategique(this);
		
	}
	public String toString(){
		return("Joueur Virtuel "+nomJoueur+" ");
	}
<<<<<<< HEAD
	
=======
>>>>>>> origin/master

}
