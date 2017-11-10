package siteParis;


public class Pari {
      private Competiteur vainqueur;
      private Joueur joueur;
      private long nbreTotalJetons;
      private Compétition competition;
		
		/**
		 */
		public Pari(Competiteur vainqueur, Joueur joueur, long nbreTotalJetons, Compétition competition){
      this.vainqueur = vainqueur;
      this.joueur = joueur;
      this.nbreTotalJetons = nbreTotalJetons;
      this.competition = competition;
		}
      

}
